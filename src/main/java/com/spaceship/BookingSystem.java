package com.spaceship;

//UI area (user creates their person account here)

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookingSystem {

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your details");
        System.out.print("Full Name: ");
        String userName = scanner.nextLine();
        System.out.print("Email: ");
        String userEmail = scanner.nextLine();
        System.out.print("Phone Number: ");
        String userPhoneNumber = scanner.nextLine();
        System.out.print("Passport Number: ");
        String userPassportNumber = scanner.nextLine();

        // File writer to write and save the file
        FileWriter myWriter = new FileWriter("someFIle.txt");
            myWriter.write(userName);
            myWriter.write(System.getProperty( "line.separator" ));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
    }
}
