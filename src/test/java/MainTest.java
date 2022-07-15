import config.SpringConfiguration;
import dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @Disabled
    void main() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);


        Person p = ac.getBean(Person.class);
        String s = ac.getBean(String.class);
        Integer i = ac.getBean(Integer.class);
        Assertions.assertEquals(p.getFirstName(),"Alexander");
        Assertions.assertEquals(s,"Test");
        Assertions.assertEquals(i,140);

    }

    @Test
    @Disabled
    void multipleBeans(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //if you have multiple beans you need to explicitly refer to one.
        Person person = ac.getBean("person1",Person.class);
        System.out.println(person);
    }


}