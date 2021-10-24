package com.spaceship.booking;

import java.io.FileWriter;
import java.io.IOException;

public class SaveBooking {


    public void userBooking(String name, String email, String phoneNumber, String passportNumber) throws IOException {
        FileWriter myWriter = new FileWriter("booking.txt");
        myWriter.write("Full name: " + name);
        myWriter.write(System.getProperty( "line.separator" ));
        myWriter.write("Email: " + email);
        myWriter.write(System.getProperty( "line.separator" ));
        myWriter.write("Phone Number: " + phoneNumber);
        myWriter.write(System.getProperty( "line.separator" ));
        myWriter.write("Passport Number: " + passportNumber);
        myWriter.close();
        System.out.println("Successfully save the booking.");
    }


}
