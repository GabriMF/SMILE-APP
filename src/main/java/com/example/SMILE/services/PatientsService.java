package com.example.SMILE.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.SMILE.models.Patients;
import com.example.SMILE.repositories.PatientsRepository;

@Service
public class PatientsService {
    private PatientsRepository repository;

    public PatientsService(PatientsRepository repository){
        this.repository = repository;
    }

    public List<Patients> getAll(){
        return repository.findAll();
    }

    public Patients getOne(Long id) {
       Patients patients = repository.findById(id).orElse(null);
        return patients;
    }

    public Patients  save(Patients patients) {
        Patients patientsSaved = repository.save(patients);
        return patientsSaved;
    }

    public static Optional <Patients> findById(Long id){
        return null;
    }
    
    public List<Patients> delete(Long id){
        repository.deleteById(id);
        return repository.findAll();
    }
}
