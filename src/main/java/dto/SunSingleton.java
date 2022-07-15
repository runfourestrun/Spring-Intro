package dto;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/***
 * @POSTCONSTRUCT will basically instantiate the class since stereotype annotations
 * are instantiated without fields for the Spring Context.
 */

@Component
public class SunSingleton {


    private Integer diamater;
    private String color;

    public SunSingleton(Integer diamater,String color){
        this.diamater = diamater;
        this.color = color;
    }

    public SunSingleton() {
    }

    public void setDiamater(int diamater) {
        this.diamater = diamater;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDiamater() {
        return diamater;
    }

    @Override
    public String toString() {
        return "SunSingleton{" +
                "diamater=" + diamater +
                ", color='" + color + '\'' +
                '}';
    }


    @PostConstruct
    public void init(){
        this.diamater = 864000;
        this.color = "Orange";

    }
}
