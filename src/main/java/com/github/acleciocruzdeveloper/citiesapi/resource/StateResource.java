package com.github.acleciocruzdeveloper.citiesapi.resource;

import com.github.acleciocruzdeveloper.citiesapi.countries.repository.CountryRepository;
import com.github.acleciocruzdeveloper.citiesapi.countries.repository.StateRepository;
import com.github.acleciocruzdeveloper.citiesapi.entities.Country;
import com.github.acleciocruzdeveloper.citiesapi.entities.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties(){
        return repository.findAll();
    }
}
