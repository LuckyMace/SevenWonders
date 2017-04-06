package com.seven.wonders.controller;

import com.seven.wonders.core.Application;
import com.seven.wonders.core.Session;
import com.seven.wonders.pojo.entity.Game;
import com.seven.wonders.pojo.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Pavel Ruban on 15.03.2017.
 * Controller for New Game Form
 */

@Scope(scopeName = "prototype")
@Controller
public class NewgameController {

    @Autowired
    private Application application;

    @Autowired
    private Session session;

    @RequestMapping(value = "/newgame", method = {RequestMethod.GET,RequestMethod.POST})
    public String newgame(Model model){
        model.addAttribute("players", application.getAllGames().get(session.getCurrentGameId()).getPlayers());
        return "newgame";
    }

    @RequestMapping(value = "/newgame/leave", method = {RequestMethod.GET,RequestMethod.POST})
    public String leaveGame(){
        String currentGameId = session.getCurrentGameId();
        Game currentGame = application.getAllGames().get(currentGameId);
        Player currentPlayer = session.getCurrentPlayer();
        List<Player> players = currentGame.getPlayers();

        if (players.contains(currentPlayer)) {
            players.remove(currentPlayer);
        }

        if (players.size() == 0) {
            application.getAllGames().remove(currentGameId);
        }

        return "redirect:/login";
    }

}
