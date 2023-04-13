import java.util.ArrayList;

public class Student extends Member {
    private ArrayList<String> courses;

    public Student(Person p) {
        super(p);
        courses = new ArrayList<String>();
    }

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
