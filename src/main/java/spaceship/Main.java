package spaceship;

//     Display the list of available options such as:
//        Option 1 Add new Flight
//        Option 2 Display all flights
//        Option 3 Display Booked Flights
//        Option 4 Display flight for a specific user
//        Option 5 Book a flight for a user using his id
//        Option 6 Cancel a flight

public class Main {
    public static void main(String[] args) {
        Passport vinhPassport = new Passport(
                "Vinh Chu", Gender.MALE, Nationality.CHINESE, 3, true, LocalDate.of(1950, Month.APRIL, 12)
        );
        Person vinh = new Person("Vinh Chu", "email@email.email", 1800033333, vinhPassport);

        Spaceship ussEnterprise = new Spaceship(Make.USSENTERPRISE, "xcv330", 950);

        SpaceshipService spaceshipService = new SpaceshipService();
        spaceshipService.addPerson(ussEnterprise, vinh);
        System.out.println(ussEnterprise);

    }
}
