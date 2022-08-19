package projects.abstractions.aspectorientedprogramming.aspectbasics;

import projects.abstractions.aspectorientedprogramming.aspectbasics.config.SpringConfiguration;
import projects.abstractions.aspectorientedprogramming.aspectbasics.model.Comment;
import projects.abstractions.aspectorientedprogramming.aspectbasics.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        Comment comment = new Comment("Alexander","fuck you");
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var bean = ac.getBean(CommentService.class);
        bean.initializeCall(comment);
    }
}
