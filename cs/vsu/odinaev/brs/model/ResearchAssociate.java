package cs.vsu.odinaev.brs.model;

import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private final List<Institute> institutes = new ArrayList<>();
    private final List<Participation> projectParticipation = new ArrayList<>();

    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() { return fieldOfStudy; }
    public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }

    public List<Institute> getInstitutes() { return new ArrayList<>(institutes); }

    public void addInstitute(Institute institute) {
        if (institute != null && !institutes.contains(institute)) {
            institutes.add(institute);
        }
    }

    public void removeInstitute(Institute institute) {
        institutes.remove(institute);
    }

    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        for (Participation participation : projectParticipation) {
            projects.add(participation.getProject());
        }
        return projects;
    }

    public void addProject(Project project, int hours) {
        if (project != null) {
            Participation participation = new Participation(this, project, hours);
            projectParticipation.add(participation);
        }
    }

    public void removeProject(Project project) {
        projectParticipation.removeIf(p -> p.getProject().equals(project));
    }

    @Override
    public String getRole() {
        return "Research Associate";
    }
}