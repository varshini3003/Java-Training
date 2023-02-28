package Builder;
import java.util.*;
public class TaskBuilder {
    private final int id;
    private String summary, description;
    private Date dueDate;
    private boolean done;
    public TaskBuilder(int id)
    {
        this.id=id;
    }
    public TaskBuilder(int id, String summary, String description, Date dueDate, boolean done)
    {
        this.summary=summary;
        this.description=description;
        this.id=id;
        this.dueDate=dueDate;
        this.done=done;
    }
    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }
    public TaskBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }
    public TaskBuilder setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
        return this;
    }
    public Task build() {
        return new Task(id,summary,description,dueDate,done);
    }
}
