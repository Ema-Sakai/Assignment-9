package com.example.catsdatabase;

public class Cat {

    private int id;
    private String breed;
    private String coats;

    public Cat(int id, String breed, String coats) {
        this.id = id;
        this.breed = breed;
        this.coats = coats;
    }

    public int getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public String getCoats() {
        return coats;
    }
}
