package com.recipe.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        // Sample prompt message for testing auto partial restart feature of Spring Dev Tools
        System.out.println("Index page get loaded");
        // Return back a String "index", which corresponds to a Thymeleaf template
        return "index";
    }
}
