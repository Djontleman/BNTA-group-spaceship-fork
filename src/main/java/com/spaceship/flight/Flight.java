package com.spaceship.flight;

import com.spaceship.person.Person;
import com.spaceship.spaceship.Spaceship;

import java.util.Arrays;

public class Flight {

    private Spaceship spaceship;
    private int capacity;
    private Person[] passengerIDs;
    private FlightJourney flightJourney;

    public Flight(Spaceship spaceship, FlightJourney flightJourney) {
        this.spaceship = spaceship;
        this.capacity = spaceship.getCapacity();
        this.passengerIDs = new Person[capacity];
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

    public Person[] getPassengerIDs() {
        return passengerIDs;
    }

    public void setPassengerIDs(Person[] passengerIDs) {
        this.passengerIDs = passengerIDs;
    }

    public FlightJourney getFlightJourney() {
        return flightJourney;
    }

    public void setFlightJourney(FlightJourney flightJourney) {
        this.flightJourney = flightJourney;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "spaceship=" + spaceship +
                ", capacity=" + capacity +
                ", passengerIDs=" + Arrays.toString(passengerIDs) +
                ", flightJourney=" + flightJourney +
                '}';
    }
}
