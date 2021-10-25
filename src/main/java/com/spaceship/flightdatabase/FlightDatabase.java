package com.spaceship.flightdatabase;

// List of potential Methods:
// - listAllFlights

// - addFlight
// - removeFlight

// - getOpenFlights
// - listOpenFlights
// - getFullFlights
// - listFullFlights

// Method to list all flights (not finished)
//    public static void showFlights (Spaceship[] listOfFlights) {
//        System.out.println(Arrays.toString(listOfFlights));
//    }



// Method to remove person from flight (not finished)
//    public void removePerson (SpaceshipService spaceship1, Person person1) {
//        Person[] passengers = spaceship1.getPassengers();
//        Arrays.asList(passengers).contains(person1.getId());
//        ArrayUtils.remove(passengers, person1);
//    }

import com.spaceship.flight.Flight;
import com.spaceship.spaceship.Spaceship;

import java.util.Arrays;

public class FlightDatabase {
    private Flight[] allFlights;

public static int count;

public FlightDatabase(){
    this.allFlights = new Flight[Flight.count];
}

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "allFlights=" + Arrays.toString(allFlights) +
                '}';
    }

    //add flight to array and then plus1 to the next spot in the array for the next flight
    public void addFlight(Flight flight1) {
        allFlights[this.count] = flight1;
        this.count++;
            }



    public Flight[] getAllFlights() {
        return allFlights;
    }
}
