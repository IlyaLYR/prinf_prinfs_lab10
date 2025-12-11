package cs.vsu.odinaev.brs.model;
public abstract class Employee {
    private int ssNo;
    private String name;
    private String email;
    private static int counter = 0;

    public Employee(int ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        counter++;
    }

    public int getSsNo() { return ssNo; }
    public void setSsNo(int ssNo) { this.ssNo = ssNo; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public static int getCounter() { return counter; }

    public abstract String getRole();

    @Override
    public String toString() {
        return String.format("%s (SSN: %d, Email: %s, Role: %s)",
                name, ssNo, email, getRole());
    }
}