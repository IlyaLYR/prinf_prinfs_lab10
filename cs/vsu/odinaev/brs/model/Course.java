package cs.vsu.odinaev.brs.model;

import java.util.*;

public class Course {
    private String name;
    private int id;
    private float hours;
    private final Collection<Lecturer> lecturers;

    public Course(String name, int id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.lecturers = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public float getHours() { return hours; }
    public void setHours(float hours) { this.hours = hours; }

    public Collection<Lecturer> getLecturer() { return lecturers; }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer){
        lecturers.remove(lecturer);
    }

    @Override
    public String toString() {
        return String.format("Course: %s (ID: %d, Hours: %.1f)", name, id, hours);
    }
}