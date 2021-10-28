package com.spaceship.flight;

import com.spaceship.flight.journey.FlightJourney;
import com.spaceship.user.User;
import com.spaceship.flight.spaceship.Spaceship;

import java.util.Arrays;
import java.util.Objects;

public class Flight {

    // todo: sort out flight count:
    // public static int count; this.count ++;
    // todo: business logic for passengers array

    private Spaceship spaceship;
//    private String spaceshipCallSign;
    private int capacity;
    private User[] passengers;
    private int numberOfPassengers;
    private FlightJourney flightJourney;

    public Flight(Spaceship spaceship,  FlightJourney flightJourney) {
        this.spaceship = spaceship;
//        this.spaceshipCallSign = spaceship.getCallSign();
        this.capacity = spaceship.getCapacity();
        this.passengers = new User[capacity];
        this.numberOfPassengers = 0;
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

    public User[] getPassengers() {
        return passengers;
    }

    public void setPassengers(User[] passengers) {
        this.passengers = passengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
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
                ", passengers=" + Arrays.toString(passengers) +
                ", numberOfPassengers=" + numberOfPassengers +
                ", flightJourney=" + flightJourney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return capacity == flight.capacity && numberOfPassengers == flight.numberOfPassengers && Objects.equals(spaceship, flight.spaceship) && Arrays.equals(passengers, flight.passengers) && flightJourney == flight.flightJourney;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(spaceship, capacity, numberOfPassengers, flightJourney);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }
}
