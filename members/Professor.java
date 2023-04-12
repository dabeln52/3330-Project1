import java.sql.Date;

public class Professor extends Member {
    private String department;
    private List<String> Students; 

    public Professor(String name, String address, Date dob, String email, String ssn, int memberID, String department, double fines, List<String> Students){
        super(name, address, dob, email, ssn, memberID, fines);
        this.department = department;
//         dont know if this is the best way to set up the student list 
//         this.students = students 
    }
    
    public int getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}
