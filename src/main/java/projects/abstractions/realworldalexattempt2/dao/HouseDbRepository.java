package projects.abstractions.realworldalexattempt2.dao;


import org.springframework.stereotype.Component;

@Component
public class HouseDbRepository implements DbRepository{



    @Override
    public <T> void createListing(T t) {
        System.out.println("This is where you would implement database insertionLogic" + t.toString());
    }
}
