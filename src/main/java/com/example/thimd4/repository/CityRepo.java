package com.example.thimd4.repository;

import com.example.thimd4.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepo extends JpaRepository<City,Long> {

}
