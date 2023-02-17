package com.example.SMILE.services;
import java.util.List;
import java.util.Optional;
import com.example.SMILE.models.Profiles;
import com.example.SMILE.repositories.ProfilesRepository;

public class ProfileService {
    private ProfilesRepository repository;

    public ProfileService(ProfilesRepository repository){
        this.repository = repository;
    }

    public List<Profiles> getAll(){
        return repository.findAll();
    }

    public Profiles getOne(Long id) {
       Profiles profiles = repository.findById(id).orElse(null);
        return profiles;
    }

    public Profiles  save(Profiles profiles) {
        Profiles profilesSaved = repository.save(profiles);
        return profilesSaved;
    }

    public static Optional <Profiles> findById(Long id){
        return null;
    }

    public List<Profiles> delete(Long id){
        repository.deleteById(id);
        return repository.findAll();
    }
}
