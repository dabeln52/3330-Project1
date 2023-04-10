import java.sql.Date;

public class Student extends Member {
    
    private String school 

    // could also include GPA to determine if they get a discount, maybe add their year to but Idk how we would make that important 
    public Student(String name, String address, Date dob, String email, String ssn, int memberID, String school){
        super(name, address, dob, email, ssn, memberID);
        this.school = school;
    }
    

    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
}
