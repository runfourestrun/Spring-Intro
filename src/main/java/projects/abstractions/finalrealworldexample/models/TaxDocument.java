package projects.abstractions.finalrealworldexample.models;

public class TaxDocument {

    private String state;
    private String preparer;
    private String details;

    public TaxDocument(String state, String preparer, String details) {
        this.state = state;
        this.preparer = preparer;
        this.details = details;
    }

    public String getState() {
        return state;
    }

    public String getPreparer() {
        return preparer;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "TaxDocument{" +
                "state='" + state + '\'' +
                ", preparer='" + preparer + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
