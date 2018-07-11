package net.whateverstart.medic.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.whateverstart.medic.model.Doctor;

public interface IDoctorRepository extends MongoRepository<Doctor, String> {
    public List<Doctor> findByName(String name);
    
}
