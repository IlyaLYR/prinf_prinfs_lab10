package cs.vsu.odinaev.brs.model;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchAssociate {
    private final List<Course> courses = new ArrayList<>();

    public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
    }

    public List<Course> getCourses() { return new ArrayList<>(courses); }

    public void addCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            course.addLecturer(this);
        }
    }

    public void removeCourse(Course course) {
        if (courses.remove(course)) {
            course.removeLecturer(this);
        }
    }

    @Override
    public String getRole() {
        return "Lecturer";
    }
}