package com.example.thimd4.service;

import com.example.thimd4.model.City;
import com.example.thimd4.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService implements ICitiService{
    @Autowired
    CityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public City save(City city) {
        return cityRepo.save(city);
    }

    @Override
    public void delete(long id) {
        cityRepo.deleteById(id);
    }

    @Override
    public City findById(long id) {
        return cityRepo.findById(id).get();
    }


}
