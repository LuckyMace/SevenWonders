package com.seven.wonders.controller;

import com.seven.wonders.core.Application;
import com.seven.wonders.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 15.03.2017.
 */

@Scope(scopeName = "prototype")
@Controller
public class NewgameController {

    @Autowired
    private Application application;

    @Autowired
    private Session session;

//    @RequestMapping(value = "/newgame", method = {RequestMethod.GET,RequestMethod.POST})
//    public String newgame(Model model){
//        model.addAttribute("players", session.getCurrentGame().getPlayers());
//        return "newgame";
//    }

}
