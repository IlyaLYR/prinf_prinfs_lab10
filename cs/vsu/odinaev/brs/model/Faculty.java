package cs.vsu.odinaev.brs.model;// 5. Faculty.java
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Employee dean;
    private final List<Institute> institutes = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Employee getDean() { return dean; }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public List<Institute> getInstitutes() { return new ArrayList<>(institutes); }

    public void addInstitute(Institute institute) {
        if (institute != null && !institutes.contains(institute)) {
            institutes.add(institute);
        }
    }

    public void removeInstitute(Institute institute) {
        institutes.remove(institute);
    }

    @Override
    public String toString() {
        return String.format("Faculty: %s, Dean: %s", name,
                dean != null ? dean.getName() : "Not assigned");
    }
}