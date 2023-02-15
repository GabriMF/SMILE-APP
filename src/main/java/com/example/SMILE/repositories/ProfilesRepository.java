package com.example.SMILE.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SMILE.models.Profiles;

public interface ProfilesRepository extends JpaRepository <Profiles, Long> {
    
}
