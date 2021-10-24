package com.spaceship.booking;

//UI area (user creates their person account here)

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookingSystem {

    public static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("someFIle.txt");
        UserValidation userValidation = new UserValidation();
        String userName;
        String userEmail;
        int userPhoneNumber;
        System.out.println("Please enter your details");
            System.out.print("Full Name: ");
            userName = scanner.nextLine();
//userValidation.emailValidation(userEmail);

            while(true) {
                System.out.print("Phone Number: ");
                userPhoneNumber = scanner.nextInt();
                if(String.valueOf(userPhoneNumber).length() == 11) {
                    break;
                }
                System.out.println("Please enter a valid phone number");
            }

            System.out.print("Passport Number: ");
            String userPassportNumber = scanner.nextLine();

        // File writer to write and save the file
            myWriter.write(userName);
            myWriter.write(System.getProperty( "line.separator" ));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
    }

}
