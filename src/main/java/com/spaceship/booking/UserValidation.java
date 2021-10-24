package com.spaceship.booking;

import java.util.Scanner;

public class UserValidation {

    Scanner scanner = new Scanner(System.in);
    public String emailValidation() {
        String userEmail;
        while(true) {
            System.out.print("Email: ");
            userEmail = scanner.nextLine();
            if(userEmail.contains("@")) {
                break;
            }
            System.out.println("Please enter a valid email.");
        }
        return userEmail;
    }

    public String phoneValidation() {
        String userPhoneNumber;
        while(true) {
            System.out.print("Phone Number: ");
            userPhoneNumber = scanner.nextLine();
            if(userPhoneNumber.length() == 11) {
                break;
            }
            System.out.println("Please enter a valid phone number");
        }
        return userPhoneNumber;
    }

}
