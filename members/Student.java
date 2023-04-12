import java.sql.Date;

public class Student extends Member {
    
    private String Professor;

    // could also include GPA to determine if they get a discount, maybe add their year to but Idk how we would make that important 
    public Student(String name, String address, Date dob, String email, String ssn, int memberID, double fines, String Professor){
        super(name, address, dob, email, ssn, memberID, fines);
        this.Professor = Professor;
    }
    

    public String getProfessor(){
        return Professor;
    }
    public void setProfessor(String Professor){
        this.Professor = Professor;
    }
}
