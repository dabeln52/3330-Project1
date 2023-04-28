
// restock shelves and make sure books are in the correct section
package peoplePackage;

public class Technician extends Employee {
    
	public Technician(String name, String address, String dob, String email, String ssn, String jobTitle) {
		super(name,address,dob,email,ssn,jobTitle);
	}
	
    public Technician(String name, String address, String dob, String email, String ssn, String empid, double fines, String department, String jobTitle) {
        super();
        
    }

}