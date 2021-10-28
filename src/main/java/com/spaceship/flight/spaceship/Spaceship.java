package com.spaceship.flight.spaceship;

import com.spaceship.flight.spaceship.spaceshipenum.SpaceshipEnum;

import java.util.Objects;

public class Spaceship {
    private String callSign;
    private String brand;
    private String model;
    private int capacity;

    public Spaceship(String callSign, SpaceshipEnum spaceshipEnum) {
        this.callSign = callSign;
        this.brand = spaceshipEnum.getBrand();
        this.model = spaceshipEnum.getModel();
        this.capacity = spaceshipEnum.getCapacity();
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "callSign='" + callSign + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spaceship spaceship = (Spaceship) o;
        return capacity == spaceship.capacity && Objects.equals(callSign, spaceship.callSign) && Objects.equals(brand, spaceship.brand) && Objects.equals(model, spaceship.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callSign, brand, model, capacity);
    }
}
