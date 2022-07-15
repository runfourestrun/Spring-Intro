package dto;

import org.springframework.stereotype.Component;


/***
 * @Component is a StereoType Annotation
 * You need to tell Spring where to look for classes Annotated with stereotype annotations
 * Do this via @ComponentScan annotations in SpringConfiguration
 */
@Component
public class Plant {


    private String name;
    private String genius;


    public Plant(String name, String genius){
        this.name = name;
        this.genius = genius;
    }
    public Plant(){};


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getGenius() {
        return genius;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", genius='" + genius + '\'' +
                '}';
    }
}
