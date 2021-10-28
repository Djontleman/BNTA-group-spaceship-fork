package com.spaceship.flight.flightdatabase;

// List of potential Methods:
// - listAllFlights

// - addFlight
// - removeFlight

// - getOpenFlights
// - listOpenFlights
// - getFullFlights
// - listFullFlights

import com.spaceship.flight.Flight;
import com.spaceship.user.person.Person;

import java.util.Arrays;

// todo: addFlightArray method, which allows you to set the array of flights
// todo: make user array:
//    private Person[] allUsers;
//    public static int userCount;
//    this.allUsers = new Person[10];
//    this.userCount = 0;
//    public void addUser(Person user) {
//        allUsers[userCount] = user;
//        userCount++;
//    }

public class FlightFileDataAccessService {

    private Flight[] allFlights;
    private int numberOfFlights;

    // Set total number of flights to 10 for now
    public FlightFileDataAccessService(){
        this.allFlights = new Flight[10];
        this.numberOfFlights = 0;
    }

    // ====== Getters and Setters ======//

    public void setAllFlights(Flight[] allFlights) {
        this.allFlights = allFlights;
    }

    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    public void setNumberOfFlights(int numberOfFlights) {
        this.numberOfFlights = numberOfFlights;
    }


    // ====== Methods ====== //

    public Flight[] getFlights() {
        return allFlights;
    }

    public void addFlight(Flight flight) {
        allFlights[this.numberOfFlights] = flight;
        this.numberOfFlights++;
    }

    public void removeFlight(Flight flight) {
        for (int i = 0; i < allFlights.length; i++) {
            if (allFlights[i].equals(flight)) {
                allFlights[i] = null;
            }
        }
        Flight[] newAllFlights = new Flight[allFlights.length];
        int i = 0;
        for (Flight existingFlight : allFlights) {
            if (existingFlight != null) {
                newAllFlights[i] = existingFlight;
                i++;
            }
        }
        this.allFlights = newAllFlights;
        this.numberOfFlights--;
    }


    // ====== Methods still to modify/move to FlightService ====== //

//    public void displayUserFLight(String id){
//        boolean flightsExist = false;
//        for(Flight flight: this.allFlights){
//            for(Person person1:flight.getPassengers()) {
//                if(person1 == null) {
//                    break;
//                }
//                if (id.equals(person1.getId())){
//                    System.out.println(flight);
//                    flightsExist = true;
//                }
//            }
//        }
//        if (!flightsExist) {
//            System.out.println("No flight booked");
//        }
//    };

//    public void addPerson (Flight flight1, Person person1){
//        if (flight1.getNumberOfPassengers() < flight1.getCapacity()){
//            Person[] passengers = flight1.getPassengers();
//            passengers[flight1.getNumberOfPassengers()] = person1;
//            flight1.setNumberOfPassengers(flight1.getNumberOfPassengers()+1);
//            System.out.println("Welcome aboard!");
//        } else {
//            System.out.println("Sorry, we're full");
//        }
//    }


    // ====== Move to UserService ====== //

//    public void addPersonUsingID (Flight flight1, String id) {
//        Person userToAdd;
//        for (Person user : allUsers) {
//            if (id.equals(user.getId())) {
//                userToAdd = user;
//                addPerson(flight1, userToAdd);
//                return;
//            }
//        }
//        System.out.println("User not found");
//    }

//    public Flight getFlightUsingString(String flightName) {
//        for (Flight flight: allFlights) {
//            if (flightName.equals(flight.getSpaceshipCallSign())) {
//                return flight;
//            }
//        }
//        return null;
//    }

//    public void cancelFLight(Flight flight, String id){
//        if (flight == null) {
//            System.out.println("Error: flight not found");
//            return;
//        }
//        Person userToRemove;
//        for (Person user: allUsers){
//            if (id.equals(user.getId())){
//                userToRemove = user;
//                for(int i = 0; i < flight.getPassengers().length; i++){
//                    if(userToRemove.equals(flight.getPassengers()[i])){
//                        flight.getPassengers()[i] = null;
//                        System.out.println("Your flight has been successfully cancelled");
//
//                        flight.setNumberOfPassengers(0);
//
//                        Person[] updatedPassengers = new Person[flight.getCapacity()];
//                        for (Person passenger : flight.getPassengers()) {
//                            if (passenger != null) {
//                                updatedPassengers[flight.getNumberOfPassengers()] = passenger;
//                                flight.setNumberOfPassengers(flight.getNumberOfPassengers() + 1);
//                            }
//                        }
//                        flight.setPassengers(updatedPassengers);
//                        return;
//                    }
//                }
//                System.out.println("Error: User not found in flight");
//            }
//        }
//
//    }


    // ====== toString method ====== //

    @Override
    public String toString() {
        return "FlightFileDataAccessService{" +
                "allFlights=" + Arrays.toString(allFlights) +
                ", numberOfFlights=" + numberOfFlights +
                '}';
    }
}

