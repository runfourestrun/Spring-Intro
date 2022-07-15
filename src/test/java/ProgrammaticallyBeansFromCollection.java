import config.SpringConfiguration;
import dto.Fruit;
import dto.Person;
import dto.Plant;
import org.assertj.core.util.Streams;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/***
 *
 * What really sucks about this is it doesn't seem like with streotype annotations you can't
 * define fields before exposing them to the spring context.
 */
public class ProgrammaticallyBeansFromCollection {


    @Test
    public void addPersonFromCollection(){

        Function<Double,Fruit> func = (Double d) -> new Fruit(d);


        List<Fruit> fruits = createPlants(func);
        Fruit f = new Fruit();
        Supplier<Fruit> supplier = () -> f;




        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        ac.registerBean("fruit1",Fruit.class,supplier);



    }


    private static List<Fruit> createPlants(Function<Double, Fruit> func){

        List<Double> numbers  = Stream.generate(Math::random)
                .limit(50)
                .collect(Collectors.toList());


        List<Fruit> plants = numbers.stream().map((Double d) -> func.apply(d)).collect(Collectors.toList());
        return plants;


    }
}
