package projects.abstractions.realworldBook.services;

import projects.abstractions.realworldBook.dao.CommentRepository;
import projects.abstractions.realworldBook.models.Comment;
import projects.abstractions.realworldBook.proxy.CommentNotificationProxy;
import org.springframework.stereotype.Component;


@Component
public class CommentService {


    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }


    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }



}
