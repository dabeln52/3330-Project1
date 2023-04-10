import java.sql.Date;

public class Member extends Person {
    private int memberID;

    public Member(String name, String address, Date dob, String email, String ssn, int memberID){
        super(name, address, dob, email, ssn);
        this.memberId = memberID;
    }
    
    public int getMemberID(){
        return memberID;
    }
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }
}
