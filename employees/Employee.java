public class Employee extends Person {
    protected String empid;
    protected double fines;
    protected String department;
    protected String jobTitle;

    public Employee() {
        super();
        this.empid = "";
        this.fines = 0;
        this.department = "";
        this.jobTitle = "";
    }

    public Employee(String name, String address, String dob, String email, String ssn) {
        super(name, address, dob, email, ssn);
        this.empid = "";
        this.fines = 0;
    }

    public Employee(Person p) {
        super(p.getName(), p.getAddress(), p.getDob(), p.getEmail(), p.getSsn());
        this.empid = "";
        this.fines = 0;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public String getEmpID() {
        return empid;
    }

    public void setEmpID(String id) {
        this.empid = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
