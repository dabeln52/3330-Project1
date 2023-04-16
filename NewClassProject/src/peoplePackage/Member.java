package peoplePackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Member extends Person {
    protected String id;
    protected double fines;
    protected String memtype;
    //Member mem = new Member(name,address,dob,email,ssn,memtype);
    public Member() {
        super();
        this.id = "";
        this.fines = 0;
        this.memtype = "";
    }

    public Member(String name, String address, String dob, String email, String ssn, String memtype) {
        super(name, address, dob, email, ssn);
        this.memtype = "";
        this.id = "";
        this.fines = 0;
        this.memtype = memtype;
    }

    public Member(Person p) {
        super(p.getName(), p.getAddress(), p.getDob(), p.getEmail(), p.getSsn());
        this.id = "";
        this.fines = 0;
        this.memtype = memtype;
    }
    
//    writing and saving to a file
    public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("Name: " + this.name + "\n");
    		writer.write("Address: " + this.address + "\n");
    		writer.write("DOB: " + this.dob + "\n");
    		writer.write("Email: " + this.email + "\n");
    		writer.write("SSN: " + this.ssn + "\n");
    		writer.write("Memtype: " + this.memtype + "\n");
    		writer.close();
    	} catch(IOException e) {
    		System.out.println("An error occured while writeing to the file");
    		e.printStackTrace();
    	}
    }
    
    
    
//    getters and setters
    public String getMemType() {
    	return this.memtype;
    }
    public void setMemType(String memtype) {
    	this.memtype = memtype;
    }
    
    public double getFines() {
        return fines;
    }
    public void setFines(double fines) {
        this.fines = fines;
    }

    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
}