package autowiredByConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String firstName;
    private String lastName;
    private Pet pet;


    /***
     * This kind of sucks that I can't just pass in other parameters with this approach.
     * @param pet
     */
    @Autowired
    public Person(Pet pet){
        this.pet = pet;
        this.firstName =  null;
        this.lastName = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pet getAnimal() {
        return pet;
    }

    public void setAnimal(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", animal=" + pet +
                '}';
    }
}
