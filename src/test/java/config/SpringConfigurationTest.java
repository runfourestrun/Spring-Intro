package config;

import dto.Education;
import dto.Institution;
import dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.convert.DurationFormat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SpringConfigurationTest {


    /***
     * Verifying that beans are UNCONNECTED (in SpringConfiguration)
     */
    @Disabled
    @Test
    public void checkUnConnectedBeans(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var edu = ac.getBean("alEducation", Education.class);
        String major = edu.getMajor();
        System.out.println("The major is: " + major);

    }

    @Test
    public void checkConnectedBeans(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Optional<Person> spencer = ac.getBean("spencerPerson",Optional.class);
        System.out.println(spencer.get().getEducation().get().toString());
    }




    @Disabled
    @Test
    public void checkThreeConnectedBeans(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Person person = ac.getBean("spencerPerson",Person.class);
        String spencersInstitution = person.getEducation().get().getInstitution().get().getName();
        System.out.println("This is spencers Institution: " + spencersInstitution);
    }

}