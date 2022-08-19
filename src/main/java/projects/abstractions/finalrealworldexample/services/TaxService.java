package projects.abstractions.finalrealworldexample.services;

import projects.abstractions.finalrealworldexample.dao.DbRepository;
import projects.abstractions.finalrealworldexample.proxies.NotificationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxService {

    private NotificationProxy nproxy;
    private DbRepository dbRepository;


    @Autowired
    public TaxService(NotificationProxy nproxy, DbRepository dbRepository){
        this.nproxy = nproxy;
        this.dbRepository = dbRepository;
    }


    public <T> void initiateService(T t){
        nproxy.sendEmail(t);
        dbRepository.createRecord(t);
    }
}
