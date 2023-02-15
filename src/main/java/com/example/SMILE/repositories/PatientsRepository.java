package com.example.SMILE.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SMILE.models.Patients;

public interface PatientsRepository extends JpaRepository <Patients, Long> {
    
}
