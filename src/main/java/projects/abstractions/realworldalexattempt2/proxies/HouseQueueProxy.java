package projects.abstractions.realworldalexattempt2.proxies;

import org.springframework.stereotype.Component;

@Component
public interface HouseQueueProxy {

    <T> void appendRecord(T t);

}
