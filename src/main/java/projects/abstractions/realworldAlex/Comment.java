package projects.abstractions.realworldAlex;

public class Comment {

    private String user;
    private String commentString;

    public Comment(String user, String commentString){
        this.user = user;
        this.commentString = commentString;
    }

    public String getUser() {
        return user;
    }

    public String getCommentString() {
        return commentString;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "user='" + user + '\'' +
                ", commentString='" + commentString + '\'' +
                '}';
    }


}
