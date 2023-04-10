import java.sql.Date;

public class Employee extends Person {
    private int employeeID;
    private String department;

    
    public Employee(String name, String address, Date dob, String email, String ssn, int employeeID, String department) {
        super(name, address, dob, email, ssn);
        this.employeeID = employeeID;
        this.department = department;
    }

    // Getters and setters for employee-specific variables
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

