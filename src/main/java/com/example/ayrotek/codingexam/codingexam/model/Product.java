package com.example.ayrotek.codingexam.codingexam.model;

public class Product {

    private String id;
    private String name;
    private String description;
    private String ownerId;

    public Product(String id, String name, String description, String ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}
