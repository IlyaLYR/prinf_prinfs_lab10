package cs.vsu.odinaev.brs.model;

public class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    @Override
    public String getRole() {
        return "Administrative Employee";
    }
}