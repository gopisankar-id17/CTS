package com.library.ormlearn.service;

import com.library.ormlearn.entity.Country;
import com.library.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}