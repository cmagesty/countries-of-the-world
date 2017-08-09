package com.countriesoftheworld.controller;

import com.countriesoftheworld.data.countryRepository;
import com.countriesoftheworld.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {
    @Autowired
    private countryRepository repository;

    @RequestMapping("/")
    @ResponseBody
    public String listCountries(ModelMap modelMap) {
        return "home";
    }

    @RequestMapping("/{countryName}")
    @ResponseBody
    public String countryDetails(@PathVariable String countryName, ModelMap modelMap) {
        Country country = countryRepository.findByName(countryName);
        modelMap.put("country", country);
        return "country-details";
    }
}
