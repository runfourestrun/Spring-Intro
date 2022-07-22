package circularDenendencyAntiPattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coral {

    private String coralType;
    private Algae algae;


    @Autowired
    public Coral(Algae algae){
        this.algae = algae;
        this.coralType = null;
    }

    public Coral(){};

    public String getCoralType() {
        return coralType;
    }

    public void setCoralType(String coralType) {
        this.coralType = coralType;
    }

    public Algae getAlgae() {
        return algae;
    }

    public void setAlgae(Algae algae) {
        this.algae = algae;
    }

    @Override
    public String toString() {
        return "Coral{" +
                "coralType='" + coralType + '\'' +
                ", algae=" + algae +
                '}';
    }
}
