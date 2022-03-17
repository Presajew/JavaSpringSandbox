package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Dog;

public interface DogDao {
    // fake db for testing
    
    int insertDog(UUID id, Dog dog);
    
    default int insertDog(Dog dog) {
        UUID id = UUID.randomUUID();
        return insertDog(id, dog);
    }
}
