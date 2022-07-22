package autowiredDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Currency;


/**
 * This is an example of the simplest way to Autowire two objects: Adding the Autowire annotation over a field.
 * I'm autowiring a class I don't have control over. I wonder what happens here?
 */

@Component
public class Country {

    private final String name = "United States";
    private Currency currency;

    public Country(Currency currency) {
        this.currency = currency;

    }

    public Country() {
    }

    public String getName() {
        return name;
    }


    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", currency=" + currency +
                '}';
    }
}



