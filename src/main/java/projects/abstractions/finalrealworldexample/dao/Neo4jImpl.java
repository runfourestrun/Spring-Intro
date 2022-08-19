package projects.abstractions.finalrealworldexample.dao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component

/***
 * What happens if I have multiple implementations of an interface/abstraction?
 * You use @Qualifer & @Primary
 */

@Qualifier("Neo4j")
@Primary
public class Neo4jImpl implements DbRepository{


    @Override
    public <T> void createRecord(T t) {
        System.out.println("We are going to be creating a record in a database here: " + t.toString());

    }
}
