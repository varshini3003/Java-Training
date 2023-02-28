package Builder;
import java.util.*;
public class Task {
    private final int id;
    private String summary, description;
    private Date dueDate;
    private boolean done;
    public Task(int id, String summary, String description, Date dueDate, boolean done)
    {
        this.summary=summary;
        this.description=description;
        this.id=id;
        this.dueDate=dueDate;
        this.done=done;
    }
    public int getId()
    {
        return id;
    }
    public String getSummary()
    {
        return summary;
    }
    public String getDescription()
    {
        return description;
    }
    public boolean isDone()
    {
        return done;
    }
    public Date getDueDate()
    {
        return dueDate;
    }
    public void setSummary(String summary)
    {
        this.summary=summary;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public void setDone(boolean done)
    {
        this.done=done;
    }
    public void setDuedate(Date dueDate)
    {
        this.dueDate=new Date(dueDate.getTime());
    }
}
