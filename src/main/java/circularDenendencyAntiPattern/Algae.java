package circularDenendencyAntiPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Algae {

    private String algeaType;
    private Coral coral;

    @Autowired
    public Algae(Coral coral){
        this.coral = coral;
        this.algeaType = null;
    }

    public Algae(){}

    public String getAlgeaType() {
        return algeaType;
    }

    public void setAlgeaType(String algeaType) {
        this.algeaType = algeaType;
    }

    public Coral getCoral() {
        return coral;
    }

    public void setCoral(Coral coral) {
        this.coral = coral;
    }
}
