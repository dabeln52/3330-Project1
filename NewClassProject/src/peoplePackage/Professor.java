package peoplePackage;
import java.util.ArrayList;

public class Professor extends Member {
    private ArrayList<String> students;
    protected String name;
    
    
    public Professor(String name, String address, String dob, String email, String ssn, String memType) {
    	super(name,address,dob,email,ssn,memType);
    }
    public Professor(Person p) {
        super(p);
        this.students = new ArrayList<String>();
    }
    public Professor() {
    	this.name = "";
    	this.address = "";
    	this.dob="";
    	this.email = "";
    	this.ssn = "";
    	this.students = new ArrayList<String>();
    }

    //have not tested or worked on these functions at all
    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        students.remove(studentName);
    }

    public void displayStudents(){
        System.out.println("Students: ");
        for(String student: students){
            System.out.println(" - " + student);
        }
    }
}