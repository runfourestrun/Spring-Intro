package projects.abstractions.realworldBook.dao;


import projects.abstractions.realworldBook.models.Comment;


public interface CommentRepository {

    void storeComment(Comment comment);
}
