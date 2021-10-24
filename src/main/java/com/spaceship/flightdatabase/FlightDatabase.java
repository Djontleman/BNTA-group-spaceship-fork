package com.spaceship.flightdatabase;

import com.spaceship.flight.Flight;

import java.util.Arrays;

//  In future include writing to file functionality

public class FlightDatabase {

    private Flight[] allFlights;

    public FlightDatabase(Flight[] flights) {
        this.allFlights = flights;
    }

    public Flight[] getFlights() {
        return allFlights;
    }

    public void setFlights(Flight[] flights) {
        this.allFlights = flights;
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flights=" + Arrays.toString(allFlights) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDatabase that = (FlightDatabase) o;
        return Arrays.equals(allFlights, that.allFlights);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(allFlights);
    }
}
