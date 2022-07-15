import config.SpringConfiguration;
import dto.Plant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {

    @Test
    void testComponentScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Plant p = ac.getBean(Plant.class);
        p.setName("Fern");
        Assertions.assertTrue(p.getName().length() > 1);
    }
}
