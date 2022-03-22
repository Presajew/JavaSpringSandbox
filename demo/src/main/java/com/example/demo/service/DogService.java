package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.DogDao;
import com.example.demo.model.Dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// declare this as a spring service
@Service
public class DogService {
    
    private final DogDao dogDao;

    @Autowired
    public DogService(@Qualifier("fakeDao") DogDao dao) {
        this.dogDao = dao;
    }

    public int addDog(Dog dog) {
        return dogDao.insertDog(dog);
    }

    public List<Dog> getAllDogs() {
        return dogDao.getListOfDogs();
    }
}
