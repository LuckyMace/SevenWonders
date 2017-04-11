package com.seven.wonders.controller;

import com.seven.wonders.core.Application;
import com.seven.wonders.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Pavel Ruban on 04.02.2017.
 * Contoller for Login From
 */

@Scope(scopeName = "prototype")
@Controller
public class LoginController {

    private String port;

    @Autowired
    private Application application;

    @Autowired
    private Session session;

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(Model model) {
        model.addAttribute("allGames", application.getAllGames().values());
        model.addAttribute("session", session);
        return "login";
    }

    @RequestMapping(value = "/login/save-selected-game", method = {RequestMethod.POST})
    public String saveSelectedGame(@RequestParam("selectedGame") String selectedGame) {
        session.setSelectedGameId(selectedGame);
        return "redirect:/login";
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
