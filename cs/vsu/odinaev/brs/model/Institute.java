package cs.vsu.odinaev.brs.model;// 6. Institute.java
import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private String address;
    private final List<ResearchAssociate> employees = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<ResearchAssociate> getEmployees() { return new ArrayList<>(employees); }

    public void addEmployee(ResearchAssociate employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
            employee.addInstitute(this);
        }
    }

    public void removeEmployee(ResearchAssociate employee) {
        if (employees.remove(employee)) {
            employee.removeInstitute(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Institute: %s, Address: %s", name, address);
    }
}