package com.example.SMILE.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.SMILE.models.Treatments;
import com.example.SMILE.services.TreatmentsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "/api/treatments")

public class TreatmentsController {
    private TreatmentsService service;

    public TreatmentsController(TreatmentsService service) {
        this.service = service;
    }
    @GetMapping(path = "")
    public List<Treatments> getAll() {
        return service.getAll();
    }
    @PostMapping(value = "")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Treatments newTreatments) {
        try {
            return ResponseEntity.ok(service.save(newTreatments));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }
    // @DeleteMapping(path = "/{id}")
    // public List<Treatments> delete(@PathVariable Long id){
    //     return service.delete(id);
    // }
          
       
    

    
}