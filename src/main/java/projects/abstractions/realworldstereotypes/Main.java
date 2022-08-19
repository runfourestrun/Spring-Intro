package projects.abstractions.realworldstereotypes;


import projects.abstractions.realworldstereotypes.config.NewSpringConfiguration;
import projects.abstractions.realworldstereotypes.models.Reciept;
import projects.abstractions.realworldstereotypes.services.RecieptService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class Main {


    public static void main(String[] args){

        Reciept reciept = new Reciept("Alexander",12412,LocalDate.of(2003,12,12));
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(NewSpringConfiguration.class);
        var bean = ac.getBean(RecieptService.class);
        bean.initiateReceipt(reciept);
    }

}
