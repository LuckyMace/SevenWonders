package com.seven.wonders.controller;

import com.seven.wonders.pojo.Game;
import com.seven.wonders.pojo.GameStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 04.02.2017.
 */
@Controller
public class LoginController {

    private String port;

    private static Map<String, Game> currentGames = new HashMap<>();

    private String newGameName;

    private String newPlayerName;



    @RequestMapping(value = "/newgame", method = RequestMethod.GET)
    public String newGame(Model model) {
        newGameName = model.asMap().get("game_name").toString();
        newPlayerName = model.asMap().get("player_name").toString();
        Game newGame = new Game();
        newGame.setName(newGameName);
        newGame.setNumber(1);
        newGame.setStatus(GameStatus.NEW);
        currentGames.put("1", newGame);
        return "login";
    }

    public String enterGame() {
        return "";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        model.addAttribute("currentGames", currentGames);
        return "login";
    }

    public Map<String, Game> getCurrentGames() {
        return currentGames;
    }

    public void setCurrentGames(Map<String, Game> currentGames) {
        this.currentGames = currentGames;
    }

    public String getNewGameName() {
        return newGameName;
    }

    public void setNewGameName(String newGameName) {
        this.newGameName = newGameName;
    }

    public String getNewPlayerName() {
        return newPlayerName;
    }

    public void setNewPlayerName(String newPlayerName) {
        this.newPlayerName = newPlayerName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
