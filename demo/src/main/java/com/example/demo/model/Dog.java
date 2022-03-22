package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dog {
    private final UUID id;
    private final String name;

    public Dog(
        @JsonProperty("id") UUID uuid, 
        @JsonProperty("name") String name) {
        this.id = uuid;
        this.name = name;
    }

    public UUID getUuid() { return this.id; }
    public String getName() { return this.name; }
}
