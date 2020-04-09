package com.sgildea.gamedeals.controller;

import com.sgildea.gamedeals.model.Upload;
import com.sgildea.gamedeals.repository.GameRepository;
import com.sgildea.gamedeals.repository.UploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@Controller
public class UploadController implements HandlerExceptionResolver {

    private static final Logger log = Logger.getLogger(UploadController.class.getName());

    @Autowired
    GameRepository gameRepository;

    @Autowired
    UploadRepository uploadRepository;

    @GetMapping("/file/add")
    public String upload(Model model) {

        return "fileUpload";
    }

    @PostMapping("/file/upload")
    public String upload(@RequestParam("file") MultipartFile file,
                         @RequestParam String name,
                         @RequestParam String email,
                         ModelMap modelMap) {

        log.info("INSIDE UPLOAD FILE METHOD");

        Upload upload = new Upload();

        upload.setEmail(email);
        upload.setName(name);

        try {
            upload.setFile(file.getBytes());

        }catch( IOException e ) {
            e.printStackTrace();
        }

        uploadRepository.save(upload);

        modelMap.addAttribute("games", gameRepository.findAllByOrderByCreateDateDesc());
        return "viewGames";
    }


    @GetMapping("/file/view")
    public String viewFiles(Model model) {

        model.addAttribute("uploads", uploadRepository.findAll());
        return "viewFiles";
    }



    @Transactional
    @RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
    public void showImage(@RequestParam("id") Long uploadId, HttpServletResponse response, HttpServletRequest request)
            throws ServletException, IOException {

        Upload upload = uploadRepository.getOne(uploadId);

        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(upload.getFile());

        response.getOutputStream().close();
    }

    @Override
    public ModelAndView resolveException(
            HttpServletRequest request,
            HttpServletResponse response,
            Object object,
            Exception exc) {

        ModelAndView modelAndView = new ModelAndView("fileUpload");
        if (exc instanceof MaxUploadSizeExceededException) {
            modelAndView.getModel().put("message", "File size exceeds limit!");
        }
        return modelAndView;
    }

}
