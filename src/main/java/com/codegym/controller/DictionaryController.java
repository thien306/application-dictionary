package com.codegym.controller;


import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {

    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/dictionary")
    public String showInputDictionary() {
        return "translate";
    }

    @GetMapping("/translate")
    public ModelAndView translate(@RequestParam String keyword, String lang) {
        return new ModelAndView("/translate", "translate", dictionaryService.findByWord(keyword, lang));
    }
}
