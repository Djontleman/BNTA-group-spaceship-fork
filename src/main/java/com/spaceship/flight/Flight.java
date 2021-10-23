package com.spaceship.flight;

import com.spaceship.spaceship.Spaceship;

public class Flight {

    private Spaceship spaceship;
    private int capacity;
    private String[] passengerIds;
    private FlightJourney flightJourney;

    public Flight(Spaceship spaceship, FlightJourney flightJourney) {
        this.spaceship = spaceship;
        this.capacity = spaceship.getCapacity();
        this.passengerIds = new String[spaceship.getCapacity()];
        this.flightJourney = flightJourney;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String[] getPassengerIds() {
        return passengerIds;
    }

    public void setPassengerIds(String[] passengerIds) {
        this.passengerIds = passengerIds;
    }

    public FlightJourney getFlightJourney() {
        return flightJourney;
    }

    public void setFlightJourney(FlightJourney flightJourney) {
        this.flightJourney = flightJourney;
    }
}
