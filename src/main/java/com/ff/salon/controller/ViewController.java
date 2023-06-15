package com.ff.salon.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ViewController{
    @GetMapping("/")
    public String home(){
        return "index.html";
    }

}