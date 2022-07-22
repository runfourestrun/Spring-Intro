package autowiredConfig;

import autowiredDTO.Country;
import autowiredDTO.President;
import autowiredDTO.SpringConfigurationAutoWired;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class AutoWireSpringConfigurationTest {


    /***
     * Using Stereotypes and Autowiring we are able to see how we autowired these instances together.
     */

    @Test
    public void testAutowiring() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigurationAutoWired.class);
        President president = ac.getBean(President.class);
        president.setFirstName("Barack");
        president.setLastName("Obama");
        Country country = president.getCountry();


    }



}