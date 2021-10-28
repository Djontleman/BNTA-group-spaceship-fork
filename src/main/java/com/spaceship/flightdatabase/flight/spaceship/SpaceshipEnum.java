package com.spaceship.flightdatabase.flight.spaceship;

public enum SpaceshipEnum {

    // Capacities are not fact
    SXF9("SpaceX", "Falcon 9",5),
    SXFH("SpaceX", "Falcon Heavy", 8),
    BONG("Blue Origin", "New Glenn", 4),
    BOBM("Blue Origin", "Blue Moon", 5),
    VGSS1("Virgin Galactic", "SpaceShipOne", 2),
    VGSS2("Virgin Galactic", "SpaceShipTwo", 10);
//    USSENTERPRISE("USSEnterprise","FederationStarship", 950),

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
