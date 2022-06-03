package com.example.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "Hello";
    }

    @RequestMapping("/")
    public String page(){
        return "index";
    }

}
