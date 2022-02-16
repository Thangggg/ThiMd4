package com.example.thimd4.service;

import com.example.thimd4.model.City;

import java.util.List;

public interface ICitiService {
    List<City> findAll();

    City save(City city);

    void delete(long id);

    City findById(long id);


}
