package ru.t1.spting_study.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class MainController {

    @GetMapping("/main")
    public String index(Model model){   //(@RequestParam(value = "name",required = false) String name) {
        model.addAttribute("name","Ivan");
        return "hello";
    }

    @PostMapping("/main")
    public String products() {
        return "redirect:/products";
    }

}
