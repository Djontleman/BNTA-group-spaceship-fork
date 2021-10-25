package com.spaceship.flight;

import com.spaceship.person.Person;
import com.spaceship.spaceship.Spaceship;

import java.util.Arrays;
import java.util.Objects;

public class Flight {

    private Spaceship spaceship;
    private String spaceshipCallSign;
    private int capacity;
    private Person[] passengers;
    private int numberOfPassengers;
    public static int count;
    private FlightJourney flightJourney;

    public Flight(Spaceship spaceship, FlightJourney flightJourney) {
        this.spaceship = spaceship;
        this.spaceshipCallSign = spaceship.getCallSign();
        this.capacity = spaceship.getCapacity();
        this.passengers = new Person[capacity];
        this.numberOfPassengers = 0;
        this.count ++;
        this.flightJourney = flightJourney;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public String getSpaceshipCallSign() {
        return spaceshipCallSign;
    }

    public void setSpaceshipCallSign(String spaceshipCallSign) {
        this.spaceshipCallSign = spaceshipCallSign;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Person[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Person[] passengers) {
        this.passengers = passengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
                ", spaceshipCallSign='" + spaceshipCallSign + '\'' +
                ", capacity=" + capacity +
                ", passengers=" + Arrays.toString(passengers) +
                ", count=" + count +
                ", flightJourney=" + flightJourney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return capacity == flight.capacity && count == flight.count && Objects.equals(spaceship, flight.spaceship) && Objects.equals(spaceshipCallSign, flight.spaceshipCallSign) && Arrays.equals(passengers, flight.passengers) && flightJourney == flight.flightJourney;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(spaceship, spaceshipCallSign, capacity, count, flightJourney);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }
}
