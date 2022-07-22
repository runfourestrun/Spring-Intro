package autowiredDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class President {

    private String firstName;
    private String lastName;
    private Double termLimit;
    @Autowired
    private Country country;

    public President(String firstName, String lastName, Double termLimit,Country country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.termLimit = termLimit;
        this.country = country;
    }

    public President(){}


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getTermLimit() {
        return termLimit;
    }

    public void setTermLimit(Double termLimit) {
        this.termLimit = termLimit;
    }

    public String getFullName(){
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    @Override
    public String toString() {
        return "President{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", termLimit=" + termLimit +
                ", country=" + country +
                '}';
    }
}
