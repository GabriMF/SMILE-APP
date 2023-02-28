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

import com.example.SMILE.models.Profiles;
import com.example.SMILE.services.ProfileService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "/api/profiles")

public class ProfileController {
    private ProfileService service;

    public ProfileController(ProfileService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Profiles> getAll() {
        return service.getAll();
    }

    @PostMapping(value = "")

    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Profiles newProfiles) {
        try {
            return ResponseEntity.ok(service.save(newProfiles));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error");
        }
    }

    @DeleteMapping(path = "/{id}")
    public List<Profiles> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}