package com.example.SMILE.controllers;

import java.util.List;

import javax.management.relation.RelationNotFoundException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.SMILE.models.Cities;

import com.example.SMILE.services.CitiesService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping(path = "/api/cities")

public class CitiesController {
    private CitiesService service;

    public CitiesController(CitiesService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Cities> index() {
        return service.getAll();
    }
    
    @PostMapping(value = "")

    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Cities newCities) {
        try {
            return ResponseEntity.ok(service.save(newCities));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Cities> replaceCities(@PathVariable(name = "id") Long id, @RequestBody Cities cities) throws RelationNotFoundException {
        Cities currentCities = service.findById(id);
        if (currentCities == null) {
            return ResponseEntity.notFound().build();
        }
        currentCities.setCities(cities.getCities());
        final Cities replaceCities = service.save(currentCities);
        return ResponseEntity.ok(replaceCities);
    }


    @DeleteMapping(path = "/{id}")
    public List<Cities> delete(@PathVariable Long id){
        return service.delete(id);
    }
    
}