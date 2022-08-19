package projects.abstractions.aspectorientedprogramming.aspectbasics.service;

import projects.abstractions.aspectorientedprogramming.aspectbasics.repository.DbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {


    private DbRepository dbRepository;
    private Logger logger = LoggerFactory.getLogger(CommentService.class);

    @Autowired
    public CommentService(DbRepository dbRepository) {
        this.dbRepository = dbRepository;
    }


    public <T> void initializeCall(T t) {
        System.out.println("This is the initializeCall for " + t.getClass().getSimpleName());
    }
}
