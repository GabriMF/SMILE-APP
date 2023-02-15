package com.example.SMILE.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SMILE.models.Cities;

public interface CitiesRepository extends JpaRepository <Cities, Long> {
    
}
