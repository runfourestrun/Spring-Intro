package dto;

import org.springframework.stereotype.Component;

@Component
public class Fruit {


    private Double weight;


    public Fruit(Double weight){
        this.weight = weight;
    }

    public Fruit(){};

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
