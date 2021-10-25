package com.spaceship.spaceship;

import com.spaceship.person.Person;

import java.util.Arrays;
import java.util.Objects;

public class Spaceship {
    private String callSign;
    private String brand;
    private String model;
    private int capacity;
    private int count;

    public Spaceship(String callSign, SpaceshipEnum spaceshipEnum) {
        this.callSign = callSign;
        this.brand = spaceshipEnum.getBrand();
        this.model = spaceshipEnum.getModel();
        this.capacity = spaceshipEnum.getCapacity();
        this.count = 0;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
