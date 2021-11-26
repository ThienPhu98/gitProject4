package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyExchange {
    @GetMapping("/exchange")
    public String exchange (@RequestParam double usd, Model model) {
        double vnd = usd *23000;
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "exchange/index";
    }
}
