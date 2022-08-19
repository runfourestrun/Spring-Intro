package projects.abstractions.realworldalexattempt2.dao;


public interface DbRepository {

    <T> void createListing(T t);
}
