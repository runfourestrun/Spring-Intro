package projects.abstractions.realworldalexattempt2.proxies;

import org.springframework.stereotype.Component;

@Component
public class HouseQueueRepository implements HouseQueueProxy {




    @Override
    public <T> void appendRecord(T t) {
        System.out.println("this is where you would put the queue logic for" + t.toString());
    }
}
