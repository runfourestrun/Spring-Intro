package projects.abstractions.realworldBook.dao;


import projects.abstractions.realworldBook.models.Comment;
import org.springframework.stereotype.Component;


@Component
public class DbCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment" + comment.getText());
    }



}
