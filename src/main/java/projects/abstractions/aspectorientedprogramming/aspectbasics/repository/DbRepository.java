package projects.abstractions.aspectorientedprogramming.aspectbasics.repository;

public interface DbRepository {

    <T> void createComment(T t);
}
