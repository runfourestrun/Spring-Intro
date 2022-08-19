package projects.abstractions.realworldalexattempt2.services;

import projects.abstractions.realworldalexattempt2.dao.DbRepository;
import projects.abstractions.realworldalexattempt2.dao.WebServiceRepository;
import projects.abstractions.realworldalexattempt2.proxies.HouseQueueProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HouseListingService {

    private final DbRepository dbRepository;
    private final WebServiceRepository webServiceRepository;
    private final  HouseQueueProxy houseQueueProxy;

    @Autowired
    public HouseListingService(DbRepository dbRepository, WebServiceRepository webServiceRepository, HouseQueueProxy houseQueueProxy) {
        this.dbRepository = dbRepository;
        this.webServiceRepository = webServiceRepository;
        this.houseQueueProxy = houseQueueProxy;
    }





    public <T> void initiateListing(T t){
        dbRepository.createListing(t);
        webServiceRepository.putRecord(t);
        houseQueueProxy.appendRecord(t);
    }




}
