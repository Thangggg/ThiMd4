package com.example.thimd4.repository;

import com.example.thimd4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Long> {
}
