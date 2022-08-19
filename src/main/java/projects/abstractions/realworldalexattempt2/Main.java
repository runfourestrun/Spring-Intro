package projects.abstractions.realworldalexattempt2;

import projects.abstractions.realworldalexattempt2.models.HouseRecord;
import projects.abstractions.realworldalexattempt2.services.HouseListingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/***
 * Once I add the Spring annotations this ceases to work :/
 */
public class Main {


    public static void main(String[] args){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        HouseRecord hr = new HouseRecord("Tempe","Alexander",5353);

        var test = ac.getBean(HouseListingService.class);

        test.initiateListing(hr);




    }
}
