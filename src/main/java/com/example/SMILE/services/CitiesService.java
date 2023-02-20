package com.example.SMILE.services;
import java.util.List;
import java.util.Optional;
import com.example.SMILE.models.Cities;
import com.example.SMILE.repositories.CitiesRepository;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

@Service
public class CitiesService {
    private CitiesRepository repository;

    public CitiesService(CitiesRepository repository){
        this.repository = repository;
    }

    public List<Cities> getAll(){
        return repository.findAll();
    }

    public Cities getOne(Long id) {
       Cities cities = repository.findById(id).orElse(null);
        return cities;
    }

    public Cities  save(Cities cities) {
        Cities citiesSaved = repository.save(cities);
        return citiesSaved;
    }

    public Cities findById(Long id){
        return null;
    }

    public List<Cities> delete(Long id){
        repository.deleteById(id);
        return repository.findAll();
    }
}
