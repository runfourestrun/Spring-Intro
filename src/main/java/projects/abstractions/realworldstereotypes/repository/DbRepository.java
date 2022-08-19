package projects.abstractions.realworldstereotypes.repository;


public interface DbRepository {

    <T> void createRecord(T t);

}
