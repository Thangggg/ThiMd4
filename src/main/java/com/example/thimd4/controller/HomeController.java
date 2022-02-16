package com.example.thimd4.controller;

import com.example.thimd4.model.City;
import com.example.thimd4.model.Country;
import com.example.thimd4.service.CityService;
import com.example.thimd4.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class HomeController {
    @Autowired
    CityService cityService;

    @Autowired
    CountryService countryService;

    @GetMapping("/country")
    public List<Country> fillAllByCountry(){
        return countryService.findAll();
    }

    @GetMapping("/city")
    public List<City> fillAllByCity(){
        return cityService.findAll();
    }

    @GetMapping("/{id}")
    public City findById(@PathVariable long id){
        return cityService.findById(id);
    }

    @PostMapping
    public City save(@RequestBody City city){
        cityService.save(city);
        return city;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        cityService.delete(id);
    }

    @PutMapping
    public City edit(@RequestBody City city){
        cityService.save(city);
        return city;
    }




}
