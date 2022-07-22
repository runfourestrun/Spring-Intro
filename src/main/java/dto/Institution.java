package dto;

public class Institution {
    private String name;
    private int institutionSize;

    public Institution(String name, int institutionSize){
        this.name = name;
        this.institutionSize = institutionSize;
    }

    public Institution(){}

    public String getName() {
        return name;
    }

    public int getInstitutionSize() {
        return institutionSize;
    }


    @Override
    public String toString() {
        return "Institution{" +
                "name='" + name + '\'' +
                ", institutionSize=" + institutionSize +
                '}';
    }
}
