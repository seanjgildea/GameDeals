package com.sgildea.gamedeals.controller;

import com.sgildea.gamedeals.consts.Constants;
import com.sgildea.gamedeals.model.Game;
import com.sgildea.gamedeals.model.Platform;
import com.sgildea.gamedeals.repository.GameRepository;
import com.sgildea.gamedeals.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class GameController {

    private static final Logger log = Logger.getLogger(GameController.class.getName());


    @Autowired
    GameRepository gameRepository;

    @Autowired
    PlatformRepository platformRepository;

    @GetMapping("/")
    public String getGames(Model model) {
        model.addAttribute("games", gameRepository.findAllByOrderByCreateDateDesc());
        log.info("getGames / " );
        return "index";
    }

    @GetMapping("/add")
    public String homePage(@ModelAttribute("command") Game command, Model model) {
        List<Platform> platforms = platformRepository.findAll();
        model.addAttribute("platforms", platforms);
        model.addAttribute("pageTitle", "Add ");
        return Constants.ADD_EDIT_GAMES_URL;
    }

    @PostMapping("/add")
    public String postGame(@Valid @ModelAttribute("command") Game game,
                           @RequestParam("file") MultipartFile file,
                           BindingResult bindingResult,
                           Model model) {


        log.info("INSIDE UPLOAD FILE METHOD v2.1");

        if (bindingResult.hasErrors()) {

            bindingResult.getAllErrors().forEach(objectError -> {
                log.info(objectError.toString());
            });

            List<Platform> platforms = platformRepository.findAll();
            model.addAttribute("platforms", platforms);
            return Constants.ADD_EDIT_GAMES_URL;
        }

        try {
            game.setFile(file.getBytes());

        }catch( IOException e ) {
            e.printStackTrace();
        }

        game.setCreateDate(LocalDateTime.now());
        gameRepository.save(game);
        return getGames(model);
    }

    @GetMapping("/edit/{id}")
    public String editGame(@PathVariable("id") Long id, Model model) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Id:" + id));
        model.addAttribute("command", game);

        List<Platform> platforms = platformRepository.findAll();
        model.addAttribute("platforms", platforms);
        model.addAttribute("pageTitle", "Edit ");
        return Constants.ADD_EDIT_GAMES_URL;
    }

    @PostMapping("/update/{id}")
    public String updateGame(@PathVariable("id") Long id, @Valid Game game, BindingResult result, Model model) {
        if (result.hasErrors()) {
            game.setId(id);
            return Constants.ADD_EDIT_GAMES_URL;
        }

        if ( game.getCreateDate() == null ) {
            game.setCreateDate(LocalDateTime.now());
        }

        gameRepository.save(game);
        model.addAttribute("games", gameRepository.findAllByOrderByCreateDateDesc());
        return getGames(model);
    }

    @GetMapping("/search")
    public String searchTitle(Model model, String title) {
        model.addAttribute("games", gameRepository.findByTitleContaining(title));
        return Constants.VIEW_GAMES_URL;
    }

    @GetMapping("/priceSort")
    public String sortByPrice(Model model) {
        model.addAttribute("games", gameRepository.findAllByOrderByPriceAsc());
        return Constants.VIEW_GAMES_URL;
    }

    @GetMapping("/titleSort")
    public String sortByTitle(Model model) {
        model.addAttribute("games", gameRepository.findAllByOrderByTitleAsc());
        return Constants.VIEW_GAMES_URL;
    }

    @GetMapping("/platformSort")
    public String sortByPlatform(Model model) {
        model.addAttribute("games", gameRepository.findAllByOrderByPlatformAsc());
        return Constants.VIEW_GAMES_URL;
    }


    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid game Id:" + id));
        gameRepository.delete(game);
        return getGames(model);
    }

    @GetMapping("/allgames")
    public List <Game> getAllGames() {
        return gameRepository.findAll();
    }

}
