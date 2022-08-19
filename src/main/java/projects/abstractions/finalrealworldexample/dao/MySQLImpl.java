package projects.abstractions.finalrealworldexample.dao;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/***
 * What happens if I have multiple implementations of an interface/abstraction?
 */


@Qualifier("Mysql")
@Component
public class MySQLImpl implements DbRepository{
    @Override
    public <T> void createRecord(T t) {
        System.out.println("This sends a record to a Mysql database" + t.toString());
    }
}
