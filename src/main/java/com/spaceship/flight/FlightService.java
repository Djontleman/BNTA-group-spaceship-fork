package com.spaceship.flight;

import com.spaceship.person.Person;
import com.spaceship.spaceship.Spaceship;

public class FlightService {

    private Flight[] listOfFlights;

    public void addFlight(Flight spaceship) {

    }

    // Method to add new person to flight
    public void addPerson (Flight flight1, Person person1){
        if (flight1.getCount() < flight1.getCapacity()){
            Person[] passengers = flight1.getPassengers();
            passengers[flight1.getCount()] = person1;
            flight1.setCount(flight1.getCount()+1);
            System.out.println("Welcome aboard!");
        } else {
            System.out.println("Sorry, we're full");
        }
    }

    // Method to remove person from flight (not finished)
    //    public void removePerson (SpaceshipService spaceship1, Person person1) {
//        Person[] passengers = spaceship1.getPassengers();
//        Arrays.asList(passengers).contains(person1.getId());
//        ArrayUtils.remove(passengers, person1);
//    }



}
