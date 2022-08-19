package projects.abstractions.realworldBook.proxy;

import projects.abstractions.realworldBook.models.Comment;
import org.springframework.stereotype.Component;


@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending this comment to email:" + comment.getText());
    }
}
