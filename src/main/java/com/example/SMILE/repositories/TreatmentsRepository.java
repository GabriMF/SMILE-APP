package com.example.SMILE.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SMILE.models.Treatments;

public interface TreatmentsRepository extends JpaRepository <Treatments, Long>{
    
}
