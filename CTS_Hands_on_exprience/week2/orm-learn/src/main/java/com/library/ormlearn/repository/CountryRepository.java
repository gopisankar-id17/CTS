package com.library.ormlearn.repository;

import com.library.ormlearn.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {

}