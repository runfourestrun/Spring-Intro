package dto;

import config.SpringConfiguration;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SunSingletonTest {


    @Test
    public void testSunSingleton() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SunSingleton sun = ac.getBean(SunSingleton.class);
        Assertions.assertThat(sun.getDiamater().equals(864000));
    }
}