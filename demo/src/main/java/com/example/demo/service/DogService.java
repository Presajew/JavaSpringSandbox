package com.example.demo.service;

import com.example.demo.dao.DogDao;
import com.example.demo.model.Dog;

public class DogService {
    
    private final DogDao dogDao;

    public DogService(DogDao dao) {
        this.dogDao = dao;
    }

    public int addDog(Dog dog) {
        return dogDao.insertDog(dog);
    }
}
