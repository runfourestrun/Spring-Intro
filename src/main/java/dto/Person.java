package dto;

import java.util.Optional;

public class Person {
    private String firstName;
    private String lastName;
    private Optional<Education> education;



    public  Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstname, String lastName, Optional<Education> education){
        this.firstName = firstname;
        this.lastName = lastName;
        this.education = education;

    }

    public Person(){

    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<Education> getEducation() {
        return education;
    }

    public void setEducation(Optional<Education> education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}