package com.spaceship.flight.journey;

public enum FlightJourney {

    // todo: add more planets
    // todo: add other properties such as journey time

    EARTHTOMARS(Planet.EARTH, Planet.MARS),
    MARSTOEARTH(Planet.MARS, Planet.EARTH),
    EARTHTOVENUS(Planet.EARTH, Planet.VENUS),
    VENUSTOEARTH(Planet.VENUS, Planet.EARTH),
    VENUSTOMARS(Planet.VENUS, Planet.MARS),
    MARSTOVENUS(Planet.MARS, Planet.VENUS);

//    EARTHTOVULCAN,
//    VULCANTOEARTH,

    private final Planet origin;
    private final Planet destination;

    FlightJourney(Planet origin, Planet destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public Planet getOrigin() {
        return origin;
    }

    public Planet getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "FlightJourney{" +
                "origin=" + origin +
                ", destination=" + destination +
                '}';
    }

    private enum Planet {
        // todo: add String name property to enum
        VENUS, EARTH, MARS,
    }
}
