package projects.abstractions.autowiredByConstructor;

import org.springframework.stereotype.Component;

@Component
public class Pet {
    private final String animalType = "Dog";
    private String name;

    public Pet(String animalType, String name) {
        this.name = name;
    }

    public Pet(){};

    public String getAnimalType() {
        return animalType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
