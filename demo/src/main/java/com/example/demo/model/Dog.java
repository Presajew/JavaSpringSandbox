package com.example.demo.model;

import java.util.UUID;

public class Dog {
    private final UUID id;
    private final String name;

    public Dog(UUID uuid, String name) {
        this.id = uuid;
        this.name = name;
    }

    public UUID getUuid() { return this.id; }
    public String getName() { return this.name; }
}
