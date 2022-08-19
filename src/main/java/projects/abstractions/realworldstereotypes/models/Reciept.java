package projects.abstractions.realworldstereotypes.models;

import java.time.LocalDate;

public class Reciept {

    private String purchaser;
    private float ammount;
    private LocalDate day;

    public Reciept(String purchaser, float ammount, LocalDate day) {
        this.purchaser = purchaser;
        this.ammount = ammount;
        this.day = day;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public float getAmmount() {
        return ammount;
    }


    @Override
    public String toString() {
        return "Reciept{" +
                "purchaser='" + purchaser + '\'' +
                ", ammount=" + ammount +
                ", day=" + day +
                '}';
    }
}
