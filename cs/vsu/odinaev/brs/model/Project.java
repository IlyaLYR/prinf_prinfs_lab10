package cs.vsu.odinaev.brs.model;

import java.util.Date;

public class Project {
    private String name;
    private Date start;
    private Date end;

    public Project(String name, Date start, Date end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getStartDate() { return start; }
    public void setStartDate(Date start) { this.start = start; }

    public Date getEndDate() { return end; }
    public void setEndDate(Date end) { this.end = end; }

    @Override
    public String toString() {
        return String.format("Project: %s (Start: %s, End: %s)", name, start, end);
    }
}