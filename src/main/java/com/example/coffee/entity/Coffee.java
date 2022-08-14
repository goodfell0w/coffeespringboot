package com.example.coffee.entity;

import java.util.UUID;

public class Coffee {
    private final UUID id;
    private String name;

    public Coffee(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name){
        this(UUID.randomUUID(), name);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
