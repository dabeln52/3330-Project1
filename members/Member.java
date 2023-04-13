public class Member extends Person {
    protected String id;
    protected double fines;

    public Member() {
        super();
        this.id = "";
        this.fines = 0;
    }

    public Member(String name, String address, String dob, String email, String ssn) {
        super(name, address, dob, email, ssn);
        this.id = "";
        this.fines = 0;
    }

    public Member(Person p) {
        super(p.getName(), p.getAddress(), p.getDob(), p.getEmail(), p.getSsn());
        this.id = "";
        this.fines = 0;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public String getMemberID() {
        return id;
    }

    public void setMemberID(String id) {
        this.id = id;
    }
}
