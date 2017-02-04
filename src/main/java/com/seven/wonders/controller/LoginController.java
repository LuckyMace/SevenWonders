package com.seven.wonders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by user on 04.02.2017.
 */
@Controller
public class LoginController {

    private String port;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "loginJsp";
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
