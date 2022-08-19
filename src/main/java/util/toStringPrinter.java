package util;

import projects.abstractions.autowiredByConstructor.Person;
import projects.abstractions.autowiredByConstructor.Pet;
import circularDenendencyAntiPattern.Algae;

import java.util.function.Function;


/*** fucked up class. ***/
public class toStringPrinter {

    public static void main(String[] args){

        Algae algae = new Algae();
        Function<Algae,String> function = (Algae a) ->
        {String coralString = a.getCoral().toString(); return coralString;};

    }




    public static <T,R> void formatToStringFunc(T type, Function<T,R> func){
        String typeAString = type.toString();





    }

    public static void formatToString(Person person, Pet pet){
        String personToString = person.toString();
        String petToString = person.getAnimal().toString();
        System.out.println(personToString + "\n" + petToString);
    }

}


