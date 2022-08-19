package projects.abstractions.realworldstereotypes.services;

import projects.abstractions.realworldstereotypes.proxies.EmailProxy;
import projects.abstractions.realworldstereotypes.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecieptService {

    private DbRepository dbRepository;
    private EmailProxy emailProxy;

    @Autowired
    public RecieptService(DbRepository dbRepository, EmailProxy emailProxy) {
        this.dbRepository = dbRepository;
        this.emailProxy = emailProxy;
    }


    public <T> void initiateReceipt(T t){
        dbRepository.createRecord(t);
        emailProxy.append(t);

    }



}
