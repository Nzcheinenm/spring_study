package ru.t1.spting_study.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/main")
    public String index() {
        return "index";
    }

    @PostMapping("/main")
    public String products(Model model) {
        return "redirect:/products";
    }

}
