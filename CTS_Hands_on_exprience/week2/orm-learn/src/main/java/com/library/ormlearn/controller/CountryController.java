package com.library.ormlearn.controller;

import com.library.ormlearn.entity.Country;
import com.library.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}