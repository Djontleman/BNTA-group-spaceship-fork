package com.spaceship.booking;

//UI area (user creates their person account here)

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookingSystem {

    public static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        UserValidation userValidation = new UserValidation();
        SaveBooking saveBooking = new SaveBooking();
        System.out.println("Please enter your details");

        System.out.print("Full Name: ");
        String name = scanner.nextLine();
        String email = userValidation.emailValidation();
        String phoneNumber = userValidation.phoneValidation();
        System.out.print("Passport Number: ");
        String passportNumber = scanner.nextLine();

        saveBooking.userBooking(name, email, phoneNumber, passportNumber);

    }

}
