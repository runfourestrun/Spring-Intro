package projects.abstractions.autowiredByConstructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class autowiredByConstructor {

    /** Really what sucks about fucking streotype annotations is you can't construct the bean before it's added to the Application Context **/
    @Test
    public void testAnnotationConfigApplicationContext() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigurationAutoWireConstructor.class);
        Person person = ac.getBean(Person.class);
        Pet pet = person.getAnimal();
        Assertions.assertEquals(person.getAnimal().getAnimalType(), "Dog");

        // This part sucks
        //Person{firstName='null', lastName='null', animal=Animal{animalType='Dog', name='null'}}
        //Animal{animalType='Dog', name='null'}

        formatToString(person,pet);


        // You need to do a bunch of bullshit setters

        person.setFirstName("Alexander");
        person.setLastName("Fournier");
        pet.setName("Frodo");


        formatToString(person,pet);














    }

    public static void formatToString(Person person, Pet pet){
        String personToString = person.toString();
        String petToString = person.getAnimal().toString();
        System.out.println(personToString + "\n" + petToString);
    }









}