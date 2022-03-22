package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.demo.model.Dog;

import org.springframework.stereotype.Repository;

// declare this class as a spring repository
@Repository("fakeDao")
public class DogFakeDataAccessService implements DogDao {

    private static List<Dog> DB = new ArrayList<>();

    @Override
    public int insertDog(UUID id, Dog dog) {
        DB.add(new Dog(id, dog.getName()));
        return 1;
    }

    @Override
    public List<Dog> getListOfDogs() {
        return DB;
    }
    
}
