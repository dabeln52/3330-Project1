package peoplePackage;
import java.util.ArrayList;

public class Librarian extends Employee {
    private ArrayList<Member> members;

    public Librarian(String name, String address, String dob, String email, String ssn, String empid, double fines, String department, String jobTitle) {
        super();
        this.members = new ArrayList<Member>();
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void displayMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(" - " + member.getName());
        }
    }
}
