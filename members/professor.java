import java.sql.Date;

public class Professor extends Member {
    private String department; 
    private String school;

    public Professor(String name, String address, Date dob, String email, String ssn, int memberID, String department, String school){
        super(name, address, dob, email, ssn, int memberID);
        this.department = department;
        this.school = school;
    }
    
    public int getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
}