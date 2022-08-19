package projects.abstractions.finalrealworldexample.proxies;


import org.springframework.stereotype.Component;

@Component
public class GmailProxy implements NotificationProxy{

    @Override
    public <T> void sendEmail(T t) {
        System.out.println("We are going to be sending an email here" + t.toString());
    }
}
