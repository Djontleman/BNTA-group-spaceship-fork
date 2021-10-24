package com.spaceship.spaceship;

public enum SpaceshipEnum {
    TESLA("Tesla", "model",5),
    AMAZON("Amazon", "model", 4),
    USSENTERPRISE("USSEnterprise","FederationStarship", 950 ),
    VIRGIN("Virgin", "model", 30);

    private final String brand;
    private final String model;
    private final int capacity;

    private SpaceshipEnum(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity(){
        return capacity;
    }
}
