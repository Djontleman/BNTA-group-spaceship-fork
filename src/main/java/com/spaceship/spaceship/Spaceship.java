package com.spaceship.spaceship;

import com.spaceship.person.Person;

import java.util.Arrays;
import java.util.Objects;

public class Spaceship {
    private enum Spaceshipenum;
    private Person[] passengers;
    private int count;

    public Spaceship(Spaceshipenum spaceshipenum) {
        this.Spaceshipenum
        this.passengers = new Person[capacity];
    }


    }

    public Person[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Person[] passengers) {
        this.passengers = passengers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Spaceship{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", passengers=" + java.util.Arrays.toString(passengers) +
                ", count=" + count +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Spaceship spaceship = (Spaceship) object;
        return capacity == spaceship.capacity && count == spaceship.count && java.util.Objects.equals(make, spaceship.make) && java.util.Objects.equals(model, spaceship.model) && java.util.Arrays.equals(passengers, spaceship.passengers);
    }

    public int hashCode() {
        int result = Objects.hash(super.hashCode(), make, model, capacity, count);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }
}
