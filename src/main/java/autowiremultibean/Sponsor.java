package autowiremultibean;

import org.springframework.stereotype.Component;

public class Sponsor {
    private String name;
    private double revenue;

    public Sponsor(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }
    public Sponsor (){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
