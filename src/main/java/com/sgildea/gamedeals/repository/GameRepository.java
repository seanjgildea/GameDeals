package com.sgildea.gamedeals.repository;

import com.sgildea.gamedeals.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    public List<Game> findByTitleContaining(String title);
    public List<Game> findAllByOrderByPriceAsc();
    public List<Game> findAllByOrderByCreateDateDesc();
    public List<Game> findAllByOrderByPlatformAsc();
    public List<Game> findAllByOrderByTitleAsc();
}