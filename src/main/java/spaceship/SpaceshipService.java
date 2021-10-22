package spaceship;

import spaceship.person.Person;

public class SpaceshipService {
    //method to add new person
    public void addPerson (Spaceship spaceship1, Person person1){
        if (spaceship1.getCount() < spaceship1.getCapacity()){
            Person[] passengers = spaceship1.getPassengers();
            passengers[spaceship1.getCount()] = person1;
            spaceship1.setCount(spaceship1.getCount()+1);
            System.out.println("Welcome aboard!");
        } else {
            System.out.println("Sorry, we're full");
        }
    }

    public void removePerson (SpaceshipService spaceship1, Person person1) {
        Person[] passengers = spaceship1.getPassengers();
        Arrays.asList(passengers).contains(person1.getId());
        ArrayUtils.remove(passengers, person1);
    }
}
