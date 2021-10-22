package spaceship;

//     Display the list of available options such as:
//        Option 1 Add new Flight
//        Option 2 Display all flights
//        Option 3 Display Booked Flights
//        Option 4 Display flight for a specific user
//        Option 5 Book a flight for a user using his id
//        Option 6 Cancel a flight

import spaceship.passport.Nationality;
import spaceship.passport.Passport;
import spaceship.person.Gender;
import spaceship.person.Person;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        Passport vinhPassport = new Passport(
//                "Vinh Chu", Gender.MALE, Nationality.CHINESE, 3, true, LocalDate.of(1950, Month.APRIL, 12)
//        );
//
//        Passport tamaraPassport = new Passport(
//                "Tamara Herrington", Gender.FEMALE, Nationality.GERMAN, 2, true, LocalDate.of(1950, Month.APRIL, 12)
//        );
//
//        Passport jonathanPassport = new Passport(
//                "Jonathan Hutchinson", Gender.MALE, Nationality.SPANISH, 1, true, LocalDate.of(1950, Month.APRIL, 12)
//        );
//
//        Person vinh = new Person("Vinh Chu", "email@email.email", 1800033333, vinhPassport);
//        Person tamara = new Person("Tamara Herrington", "email@gmail.email", 123455678, tamaraPassport);
//        Person jonathan = new Person("Jonathan Hutchinson", "email@yahoo.email", 987654432, jonathanPassport);
//
//
//        Spaceship ussEnterprise = new Spaceship(Make.USSENTERPRISE, "xcv330", 2);
//
//        SpaceshipService spaceshipService = new SpaceshipService();
//        spaceshipService.addPerson(ussEnterprise, vinh);
//        spaceshipService.addPerson(ussEnterprise, tamara);
//        spaceshipService.addPerson(ussEnterprise, jonathan);
//
//        System.out.println(ussEnterprise);

        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.start();
    }
}
