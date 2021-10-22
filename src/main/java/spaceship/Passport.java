package spaceship;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String name;
    private Gender gender;
    private Nationality nationality;
    private int passportNumber;
    private boolean isValid;
    private LocalDate dateOfBirth;

    public Passport(String name, Gender gender, Nationality nationality, int passportNumber, boolean isValid, LocalDate dateOfBirth
        ){
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passportNumber = passportNumber;
        this.isValid = isValid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", nationality=" + nationality +
                ", passportNumber=" + passportNumber +
                ", isValid=" + isValid +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber && isValid == passport.isValid && Objects.equals(name, passport.name) && gender == passport.gender && nationality == passport.nationality && Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, nationality, passportNumber, isValid, dateOfBirth);
    }
}
