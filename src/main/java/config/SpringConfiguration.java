package config;

import dto.Person;
import dto.Plant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * NOTE A configuration class is a special class in Spring applications that we
 * use to instruct Spring to do specific actions.
 * For example, we can tell Spring to create beans or to enable certain functionalities.
 *
 *
 *
 * 1. Define a configuration class (annotated with @Configuration)
 * 2. Add a method to the configuration class that returns the object instance you want to add to the context
 * 3. Make Spring use the configuration classes to write different configuration frameworks
 *
 *
 * The benefit of Component Scan is you don't need to create methods for beans to expose instances to the Spring context
 * you can also only add one instance of the class to the context with Components, so they must be singletons.
 */
@Configuration
@ComponentScan(basePackages = "dto") // TODO: This does not work for some reason. See chapter 2 in Spring Start here
public class SpringConfiguration {

    @Bean
    public Person person0(){
        Person p = new Person("Alexander","Fournier");
        return p;
    }


    @Bean
    public Person person1(){
        Person p1 = new Person("Jonny","Sins");
        return p1;
    }



    @Bean
    Integer intTest(){
        Integer i = 140;
        return i;
    }


}
