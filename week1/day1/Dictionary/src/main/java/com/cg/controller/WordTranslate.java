package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class WordTranslate {
    @GetMapping("/translate")
    public String translate (@RequestParam String word, Model model) {
        String[] english = {"cat", "dog", "fish", "chicken", "duck"};
        String[] vietnamese = {"meo", "cho", "ca", "ga", "vit"};
        String result = "";
        String wordTrans = word.toLowerCase();
        for (int i = 0; i < english.length; i++) {
            if (wordTrans.equals(english[i])) {
                result = vietnamese[i];
            }
        }

        if (result.equals("")) {
            result = "not have in dictionary!";
        }

        model.addAttribute("english", word);
        model.addAttribute("vietnamese", result);

        return "translate";
    }
}
