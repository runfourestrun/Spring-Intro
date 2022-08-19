package projects.abstractions.finalrealworldexample;

import projects.abstractions.finalrealworldexample.config.SpringConfiguration;
import projects.abstractions.finalrealworldexample.models.TaxDocument;
import projects.abstractions.finalrealworldexample.services.TaxService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/***
 * ToDO: Notice that there are two implementations of DbRepository
 */
public class Main {

    public static void  main(String[] args){

        TaxDocument td = new TaxDocument("RI","Alexander","fooogoogogorgor");
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var test = ac.getBean(TaxService.class);
        test.initiateService(td);

    }
}
