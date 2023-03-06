package com.example.SMILE.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.SMILE.models.Treatments;
import com.example.SMILE.repositories.TreatmentsRepository;

@Service
public class TreatmentsService {
    private TreatmentsRepository repository;

    public TreatmentsService(TreatmentsRepository repository) {
        this.repository = repository;
    }

    public List<Treatments> getAll(){
        return repository.findAll();
    }

    public Treatments getOne(Long id) {
       Treatments treatments = repository.findById(id).orElse(null);
        return treatments;
    }

    public Treatments  save(Treatments treatments) {
        Treatments treatmentsSaved = repository.save(treatments);
        return treatmentsSaved;
    }

    public Treatments findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Treatments> delete(Long id){
        repository.deleteById(id);
        return repository.findAll();
    }

}
