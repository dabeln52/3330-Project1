package peoplePackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee extends Person {
	private static int lastEmpId = 0;
    protected int empid;
    protected double fines;
    protected String department;
    protected String jobTitle;

    public Employee() {
        super();
        this.empid = ++lastEmpId;
        this.fines = 0;
        this.department = "";
        this.jobTitle = "";
    }
    //using ++lastId to auto increment a members id
    public Employee(String name, String address, String dob, String email, String ssn, String jobTitle) {
        super(name, address, dob, email, ssn);
        this.empid = ++lastEmpId;
        this.fines = 0;
        this.jobTitle = jobTitle;
    }

    public Employee(Person p) {
        super(p.getName(), p.getAddress(), p.getDob(), p.getEmail(), p.getSsn());
        this.empid = ++lastEmpId;
        this.fines = 0;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public int getEmpID() {
        return empid;
    }

    public void setEmpID(int id) {
        this.empid = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
//    saving to a the file
    public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("Employee ID: " + this.empid  + "\n");
    		writer.write("Name: " + this.name + "\n");
    		writer.write("Address: " + this.address + "\n");
    		writer.write("DOB: " + this.dob + "\n");
    		writer.write("Email: " + this.email + "\n");
    		writer.write("SSN: " + this.ssn + "\n");
    		writer.write("Job Title: " + this.jobTitle + "\n");
    		writer.close();
    	} catch(IOException e) {
    		System.out.println("An error occured while writeing to the file");
    		e.printStackTrace();
    	}
    }
    
    public static void displayEmployee(Employee employee) {
    	System.out.println("Employee ID: " + employee.empid + "\n");
    	System.out.println("Name: " + employee.name + "\n");
    	System.out.println("Address: " + employee.address + "\n");
    	System.out.println("DOB: " + employee.dob + "\n");
    	System.out.println("Email: " + employee.email + "\n");
    	System.out.println("SSN: " + employee.ssn + "\n");
    	System.out.println("Job Title: " + employee.jobTitle + "\n");
    	
    }
    
    
    
    
}