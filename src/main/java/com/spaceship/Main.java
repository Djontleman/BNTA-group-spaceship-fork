package com.spaceship;

//     Display the list of available options such as:
//        Option 2 Display all flights
//        Option 3 Display Booked Flights
//        Option 4 Display flight for a specific user
//        Option 5 Book a flight for a user using his id
//        Option 6 Cancel a flight

import com.spaceship.flight.Flight;
import com.spaceship.flight.journey.FlightJourney;
import com.spaceship.flight.flightdatabase.FlightFileDataAccessService;
import com.spaceship.user.person.passport.Nationality;
import com.spaceship.user.person.passport.Passport;
import com.spaceship.user.person.Gender;
import com.spaceship.user.person.Person;

import com.spaceship.flight.spaceship.Spaceship;
import com.spaceship.flight.spaceship.spaceshipenum.SpaceshipEnum;
import com.spaceship.usersession.UserSession;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

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
        Spaceship spaceship2 = new Spaceship("Spaceship2", SpaceshipEnum.TESLA);
        Flight testFlight2 = new Flight(spaceship2, FlightJourney.EARTHTOMARS);
        Spaceship spaceship3 = new Spaceship("Spaceship3", SpaceshipEnum.USSENTERPRISE);
        Flight testFlight3 = new Flight(spaceship3, FlightJourney.EARTHTOMARS);
        Spaceship spaceship4 = new Spaceship("Spaceship4", SpaceshipEnum.VIRGIN);
        Flight testFlight4 = new Flight(spaceship4, FlightJourney.MARSTOVENUS);

        FlightFileDataAccessService flightFileDataAccessService = new FlightFileDataAccessService();
        flightFileDataAccessService.addUser(vinh);
        flightFileDataAccessService.addUser(tamara);
        flightFileDataAccessService.addUser(jonathan);
        flightFileDataAccessService.addFlight(testFlight);
        flightFileDataAccessService.addFlight(testFlight2);
        flightFileDataAccessService.addFlight(testFlight3);
        flightFileDataAccessService.addFlight(testFlight4);

//        System.out.println(flightDatabase);
//        flightDatabase.getAllFlights();

//        flightDatabase.addPerson(testFlight, vinh);
//        System.out.println(testFlight);

//        String vinhID = vinh.getId();
//        String tamaraID = tamara.getId();
        System.out.println(vinh.getId());

//        System.out.println(flightDatabase);

//        flightDatabase.cancelFLight(testFlight, vinhID);

//        System.out.println(flightDatabase);
//        flightDatabase.addPersonUsingID(testFlight, tamaraID);
//        System.out.println(flightDatabase);

//        flightDatabase.displayUserFLight(tamara.getId());
//        flightDatabase.displayUserFLight(vinh.getId());

//        flightDatabase.displayUserFLight(vinhID);
//        flightDatabase.displayUserFLight(tamaraID);



        UserSession userSession = new UserSession();
        userSession.start(flightFileDataAccessService);
    }
}