package com.seven.wonders.core;

import com.seven.wonders.pojo.entity.Game;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pavel Ruban on 15.03.2017.
 * Controller for Application
 */

@Component
public class Application {

    private Map<String, Game> allGames = new HashMap<>();

    public Map<String, Game> getAllGames() {
        return allGames;
    }

    public void setAllGames(Map<String, Game> allGames) {
        this.allGames = allGames;
    }
}
