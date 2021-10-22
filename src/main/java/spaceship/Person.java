package spaceship;

import java.util.UUID;

public class Person {
    private String id;
    private String name;
    private String email;
    private int phoneNumber;
    private Passport passport;

    public Person(UUID id,String name, String email, int phoneNumber, int passportNumber) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.passportNumber = passportNumber;
    }


}
