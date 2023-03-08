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

import com.example.SMILE.models.Patients;
import com.example.SMILE.services.PatientsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "/api/patients")

public class PatientsController {
    private PatientsService service;

    public PatientsController(PatientsService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Patients> getAll() {
        return service.getAll();
    }

    @PostMapping(value = "")

    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Patients newPatients) {
        try {
            return ResponseEntity.ok(service.save(newPatients));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Patients> replacePatients(@PathVariable(name = "id") Long id, @RequestBody Patients patients) throws RelationNotFoundException {
        Patients currentPatients = service.findById(id);
        if (currentPatients == null) {
            return ResponseEntity.notFound().build();
        }
        currentPatients.setDni(patients.getDni());
        currentPatients.setName(patients.getName());
        currentPatients.setLastName(patients.getLastName());
        
        final Patients replacePatients = service.save(currentPatients);
        return ResponseEntity.ok(replacePatients);
    }

    @DeleteMapping(path = "/{id}")
    public List<Patients> delete(@PathVariable Long id){
    return service.delete(id);
    }
}