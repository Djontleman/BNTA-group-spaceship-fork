package com.spaceship.usersession;

import java.util.Scanner;

public class UserSession {

    public void start() {

        boolean session = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Main Menu");
            System.out.println("Please choose one of the following options:");
            System.out.println("1 - View all flights");
            System.out.println("2 - Book a new flight");
            System.out.println("3 - View booked flights");
            System.out.println("4 - Cancel a flight");
            System.out.println("5 - Exit session");
            System.out.println();
            System.out.print("Option: ");
            String mainMenuResponse = scanner.nextLine();
            System.out.println();

            switch(mainMenuResponse) {
                case "1":
                    // View all flights

                    System.out.println("Option 1 stuff goes here");
                    System.out.println();
                    break;
                case "2":
                    // Book a new flight

                    System.out.println("Option 2 stuff goes here");
                    System.out.println();
                    break;
                case "3":
                    // View booked flights

                    System.out.println("Option 3 stuff goes here");
                    System.out.println();
                    break;
                case "4":
                    // Cancel a flight

                    System.out.println("Option 4 stuff goes here");
                    System.out.println();
                    break;
                case "5":
                    session = false;
                    System.out.println("Now exiting session");
                    System.out.println();
                    break;
                default:
                    System.out.println("Error: invalid response");
                    System.out.println();
            }
        } while (session);
        System.out.println("Thank you for using our service, goodbye!");
    }

}
