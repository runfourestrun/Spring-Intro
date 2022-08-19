package projects.abstractions.realworldalexattempt2.dao;

import org.springframework.stereotype.Component;

@Component
public interface WebServiceRepository {

    <T> void putRecord(T t);

}
