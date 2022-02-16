package com.example.thimd4.service;

import com.example.thimd4.model.Country;
import com.example.thimd4.repository.CountryRepo;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();


}
