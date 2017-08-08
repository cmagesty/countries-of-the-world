package com.countriesoftheworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

    @RequestMapping("/")
    @ResponseBody
    public String listCountries(ModelMap modelMap) {
        return "home";
    }
}
