package com.seven.wonders.controller;

import com.seven.wonders.core.Application;
import com.seven.wonders.core.Session;
import com.seven.wonders.pojo.Game;
import com.seven.wonders.pojo.GameStatus;
import com.seven.wonders.pojo.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 04.02.2017.
 */

@Scope(scopeName = "prototype")
@Controller("/login")
public class LoginController {

    private String port;

    @Autowired
    private Application application;

    @Autowired
    private Session session;

    @RequestMapping(value = "/newgame", method = {RequestMethod.GET,RequestMethod.POST})
    public String newGame(Model model) {
        session.getCurrentPlayer().setAdmin(true);
        session.getCurrentPlayer().setName((String) model.asMap().get("player_name"));
        String newGameName = (String) model.asMap().get("game_name");
        Game newGame = new Game();
        newGame.setName(newGameName);
        newGame.setNumber(1);
        newGame.setStatus(GameStatus.NEW);
        application.getAllGames().put((application.getAllGames().size() + 1) + "", newGame);
        newGame.getPlayers().add(session.getCurrentPlayer());
        return "newgame";
    }

    public String enterGame() {
        return "";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public String login(Model model){
        model.addAttribute("allGames", application.getAllGames().values());
        return "login";
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
