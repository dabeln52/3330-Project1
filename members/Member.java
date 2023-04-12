import java.sql.Date;

public class Member extends Person {
    private int memberID;
    private double fines;

    public Member(String name, String address, Date dob, String email, String ssn, int memberID, double fines){
        super(name, address, dob, email, ssn);
        this.memberId = memberID;
        this.fines = fines;
    }
    
    public int getMemberID(){
        return memberID;
    }
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }
    
    public double getFines(){
        `return fines;
    }
    public void setFines(double fines){
        this.fines = fines;
    }
}
