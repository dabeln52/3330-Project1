package peoplePackage;

public class External extends Member {
   
    public External(String name, String address, String dob, String email, String ssn, String memtype) {
        super(name, address, dob, email, ssn, memtype);

    }

    public External(Person p) {
        super(p);
        
    }

    
}