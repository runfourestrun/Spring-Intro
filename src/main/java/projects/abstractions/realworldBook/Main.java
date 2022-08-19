package projects.abstractions.realworldBook;

import projects.abstractions.realworldBook.models.Comment;
import projects.abstractions.realworldBook.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

    public static void main(String[] args){


        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var bean = ac.getBean(CommentService.class);
        Comment comment = new Comment("Alex","4t4t4");
        bean.publishComment(comment);


    }
}
