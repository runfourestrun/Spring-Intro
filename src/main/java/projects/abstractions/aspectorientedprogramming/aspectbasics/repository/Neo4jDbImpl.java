package projects.abstractions.aspectorientedprogramming.aspectbasics.repository;


import org.springframework.stereotype.Repository;

@Repository
public class Neo4jDbImpl implements DbRepository{
    @Override
    public <T> void createComment(T t) {
        System.out.println("This is a comment");
    }
}
