import java.util.ArrayList;

public class Professor extends Member {
    private ArrayList<String> students;

    public Professor(Person p) {
        super(p);
        this.students = new ArrayList<String>();
    }

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
}
