package projects.abstractions.realworldstereotypes.proxies;

import org.springframework.stereotype.Repository;

@Repository
public class GmailProxyImpl implements EmailProxy{


    @Override
    public <T> void append(T t) {
        System.out.println("This is a Gmail repository" + t.toString());
    }
}
