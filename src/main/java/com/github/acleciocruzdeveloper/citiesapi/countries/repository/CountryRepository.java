package com.github.acleciocruzdeveloper.citiesapi.countries.repository;

import com.github.acleciocruzdeveloper.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
