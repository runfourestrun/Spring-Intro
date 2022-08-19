package autowiremultibean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Golfer {

    private String name;
    private int handicap;
    private Sponsor sponsor;


    @Autowired
    public Golfer(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Golfer(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHandicap() {
        return handicap;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public String toString() {
        return "Golfer{" +
                "name='" + name + '\'' +
                ", handicap=" + handicap +
                ", sponsor=" + sponsor +
                '}';
    }
}
