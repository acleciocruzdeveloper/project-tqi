package com.github.acleciocruzdeveloper.citiesapi.countries.repository;

import com.github.acleciocruzdeveloper.citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long > {
}
