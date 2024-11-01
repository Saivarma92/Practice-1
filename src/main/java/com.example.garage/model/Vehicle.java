package com.example.garage.model;

public class Vehicle {
    private String licensePlate;
    private String model;
    private String owner;

    // Existing no-argument constructor (if needed)
    public Vehicle() {
    }

    // New constructor with parameters
    public Vehicle(String licensePlate, String model, String owner) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.owner = owner;
    }

    // Getters and setters (if necessary)
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

