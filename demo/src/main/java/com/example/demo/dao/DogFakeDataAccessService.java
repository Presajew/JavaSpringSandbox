package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.demo.model.Dog;

public class DogFakeDataAccessService implements DogDao {

    private static List<Dog> DB = new ArrayList<>();

    @Override
    public int insertDog(UUID id, Dog dog) {
        // TODO Auto-generated method stub
        DB.add(new Dog(id, dog.getName()));
        return 1;
    }
    
}
