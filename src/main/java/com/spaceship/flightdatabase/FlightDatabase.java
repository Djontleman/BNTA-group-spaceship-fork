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

//        if (flight1.getCount() < flight1.getCapacity()){
//        Person[] passengers = flight1.getPassengers();
//        passengers[flight1.getCount()] = person1;
//        flight1.setCount(flight1.getCount()+1);
//        System.out.println("Welcome aboard!");
//        } else {
//        System.out.println("Sorry, we're full");
//        }
//        }

// Method to remove person from flight (not finished)
//    public void removePerson (SpaceshipService spaceship1, Person person1) {
//        Person[] passengers = spaceship1.getPassengers();
//        Arrays.asList(passengers).contains(person1.getId());
//        ArrayUtils.remove(passengers, person1);
//    }

import com.spaceship.flight.Flight;

public class FlightDatabase {
    private Flight[] allFlights;

public FlightDatabase(){
    this.allFlights = new Flight[Flight.count];
}

    public void addFlight() {

    }


    public Flight[] getAllFlights() {
        return allFlights;
    }
}
