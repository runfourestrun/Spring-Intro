package projects.abstractions.realworldAlex;

import java.util.List;

public class HouseChoreTask implements TaskInterface {


    private final int taskId;
    private List<Comment> comments;
    private String taskDescription;


    public HouseChoreTask(TaskInterface taskInterface, String task) {
        this.taskId = Util.generateTaskID();
        this.taskDescription = generateTask(task);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public int getTaskId() {
        return taskId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    @Override
    public String generateTask(String task) {
        return "this is a bullshit housechoretask" + task;
    }

    @Override
    public String toString() {
        return "HouseChoreTask{" +
                "taskId=" + taskId +
                ", comments=" + comments +
                ", taskDescription='" + taskDescription + '\'' +
                '}';
    }
}


