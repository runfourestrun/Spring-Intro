package autowiremultibean;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/***
 * What happens if we have multiple beans in which Spring needs to inject a value into a paramater or class field.
 */
@Configuration
@ComponentScan("autowiremultibean")
public class SpringConfigurationMultiBean {

    @Bean
    public Sponsor NikeSponsor(){
        Sponsor sponsor = new Sponsor("Nike",100000000.00);
        return sponsor;
    }

    @Bean
    public Sponsor AdidasSponsor(){
        Sponsor sponsor = new Sponsor("Adidas",5000000.00);
        return sponsor;
    }


    /***
     * Notice how the variable referenced is the same as the method name above.
     * @param NikeSponsor
     * @return
     */
    @Bean
    public Golfer golfer(Sponsor NikeSponsor){
        Golfer golfer = new Golfer(NikeSponsor);
        golfer.setName("Tiger Woods");
        golfer.setHandicap(-4);
        return golfer;
    }


    @Bean
    Golfer golfer2(@Qualifier("AdidasSponsor") Sponsor sponsor){
        Golfer phil = new Golfer(sponsor);
        phil.setName("Phil Mickleson");
        phil.setHandicap(-10);
        return phil;

    }




}
