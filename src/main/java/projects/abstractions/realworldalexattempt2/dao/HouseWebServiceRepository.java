package projects.abstractions.realworldalexattempt2.dao;
import org.springframework.stereotype.Component;

@Component
public class HouseWebServiceRepository implements WebServiceRepository{


    @Override
    public <T> void putRecord(T t) {
        System.out.println("Business logic to insert record into database" + t.toString());
    }
}
