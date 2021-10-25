package com.spaceship;

//     Display the list of available options such as:
//        Option 2 Display all flights
//        Option 3 Display Booked Flights
//        Option 4 Display flight for a specific user
//        Option 5 Book a flight for a user using his id
//        Option 6 Cancel a flight

import com.spaceship.booking.BookingSystem;
import com.spaceship.flight.Flight;
import com.spaceship.flight.FlightJourney;
import com.spaceship.flightdatabase.FlightDatabase;
import com.spaceship.passport.Nationality;
import com.spaceship.passport.Passport;
import com.spaceship.person.Gender;
import com.spaceship.person.Person;

import com.spaceship.spaceship.Spaceship;
import com.spaceship.spaceship.SpaceshipEnum;
import com.spaceship.usersession.UserSession;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        Passport vinhPassport = new Passport(
                "Vinh Chu", Gender.MALE, Nationality.CHINESE, 3, true, LocalDate.of(1950, Month.APRIL, 12)
        );
        Passport tamaraPassport = new Passport(
                "Tamara Herrington", Gender.FEMALE, Nationality.GERMAN, 2, true, LocalDate.of(1950, Month.APRIL, 12)
        );
        Passport jonathanPassport = new Passport(
                "Jonathan Hutchinson", Gender.MALE, Nationality.SPANISH, 1, true, LocalDate.of(1950, Month.APRIL, 12)
        );

        Person vinh = new Person("Vinh Chu", "email@email.email", 1800033333, vinhPassport);
        Person tamara = new Person("Tamara Herrington", "email@gmail.email", 123455678, tamaraPassport);
        Person jonathan = new Person("Jonathan Hutchinson", "email@yahoo.email", 987654432, jonathanPassport);

        Spaceship spaceship1 = new Spaceship("Spaceship1", SpaceshipEnum.AMAZON);
        Flight testFlight = new Flight(spaceship1, FlightJourney.EARTHTOVULCAN);
        Flight testFlight2 = new Flight(spaceship1, FlightJourney.EARTHTOVULCAN);

        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.addFlight(testFlight);
        flightDatabase.addFlight(testFlight2);
//        System.out.println(flightDatabase);
        flightDatabase.getAllFlights();

        flightDatabase.addPerson(testFlight, vinh);
        System.out.println(testFlight);




       /* UserSession userSession = new UserSession();
        userSession.start();*/
    }
}