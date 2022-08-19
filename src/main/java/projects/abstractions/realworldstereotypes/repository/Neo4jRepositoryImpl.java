package projects.abstractions.realworldstereotypes.repository;

import org.springframework.stereotype.Component;


@Component
public class Neo4jRepositoryImpl implements DbRepository{

    @Override
    public <T> void createRecord(T t) {
        System.out.println("This is a record being created" + t.toString());
    }
}
