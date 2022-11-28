package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("This is home url");
        model.addAttribute("name", "Jay Patel");
        model.addAttribute("id",123);
        return "index";
    }

    @RequestMapping("/help")
    public String help()
    {
        return "help";
    }
}
