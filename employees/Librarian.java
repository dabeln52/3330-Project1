import java.sql.Date;

public class Librarian extends Employee {
    private string jobTitle;
    private string LibraryName;


    
    public Employee(String name, String address, Date dob, String email, String ssn, int employeeID, String department, String jobTitle, String LibraryName) {
        super(name, address, dob, email, ssn, employeeID, department);
        this.jobTitle = jobTitle;
        this.LibraryName = LibraryName;
    }

    // Getters and setters for Librarian-specific variables such as job title and library location
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public string getLibraryName(){
        return LibraryName;
    }
    public void setLibraryName(String LibraryName);{
        this.LibraryName = LibraryName;
    }
}
