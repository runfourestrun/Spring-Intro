package autowiremultibean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class GolferTest {

    @Test
    @Disabled
    public void testMultiBean() {


        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigurationMultiBean.class);
        Golfer golfer = ac.getBean(Golfer.class);
        golfer.setName("Tiger Woods");
        golfer.setHandicap(-5);
        Assertions.assertEquals(golfer.getSponsor().getName(),"Nike");

    }

    @Test
    public void testMultiBean2(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigurationMultiBean.class);
        Golfer phil = ac.getBean("golfer2",Golfer.class);
        Assertions.assertEquals(phil.getSponsor().getName(),"Adidas");

    }


}