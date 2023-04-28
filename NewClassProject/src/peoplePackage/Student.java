package peoplePackage;
import java.util.ArrayList;

public class Student extends Member {
    private ArrayList<String> courses;
    
    public Student(String name, String address, String dob, String email, String ssn, String memType) {
    	super(name,address,dob,email,ssn,memType);
    }
    
    public Student(Person p) {
        super(p);
        courses = new ArrayList<String>();
    }

    //dont know if we should even add courses
    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}