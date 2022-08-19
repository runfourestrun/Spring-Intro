package projects.abstractions.realworldAlex;

import java.util.List;

public class WorkTask implements TaskInterface{

    private final int taskId;
    private List<Comment> comments;
    private String taskDescription;



    public WorkTask(String task){
        this.taskId = Util.generateTaskID();
        this.taskDescription = generateTask(task);
    }




    public void addComment(Comment comment){
        comments.add(comment);
    }

    @Override
    public String generateTask(String taskDetails) {
        return "This is a bullshit work task" + taskDetails;

    }


    public int getTaskId() {
        return taskId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "WorkTask{" +
                "taskId=" + taskId +
                ", comments=" + comments +
                ", taskDescription='" + taskDescription + '\'' +
                '}';
    }
}
