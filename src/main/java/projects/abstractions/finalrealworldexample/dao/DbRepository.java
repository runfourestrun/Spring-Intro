package projects.abstractions.finalrealworldexample.dao;

public interface DbRepository {

    public <T> void createRecord(T t);
}
