package peoplePackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import itemsPackage.LibraryMaterial;
import peoplePackage.Librarian.CheckOutable;

public class Member extends Person {
	private ArrayList<LibraryMaterial> checkedOutItems;


	private String name;
	private static int lastId = 0;
    protected int id;
    protected double fines;
    protected String memtype;

    public Member() {
        super();
        this.checkedOutItems = new ArrayList<>();
        this.name = "";
        this.address = "";
        this.dob = "";
        this.email = "";
        this.ssn = "";
        this.id = ++lastId;
        this.fines = 0;
        this.memtype = "";
    }
    
    //using ++lastId to auto increment a members id
    public Member(String name, String address, String dob, String email, String ssn, String memtype) {
        super(name, address, dob, email, ssn);
        this.id = ++lastId;
        this.fines = 0;
        this.memtype = memtype;
    }

    public Member(Person p) {
        super(p.getName(), p.getAddress(), p.getDob(), p.getEmail(), p.getSsn());
        this.id = ++lastId;
        this.fines = 0;
        this.memtype = memtype;
    }
    
//    writing and saving to a file
    public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("ID: " + this.id  + "\n");
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
    
    //display members 
    public static void displayMembers(Member member) {
    	System.out.println("ID: " + member.id + "\n");
    	System.out.println("Name: " + member.name + "\n");
    	System.out.println("Address: " + member.address + "\n");
    	System.out.println("DOB: " + member.dob + "\n");
    	System.out.println("Email: " + member.email + "\n");
    	System.out.println("SSN: " + member.ssn + "\n");
    	System.out.println("Memtype: " + member.memtype + "\n");
    	
    }
//    display checked out items
    public void displayCheckedOutItems() {
    	this.checkedOutItems = new ArrayList<>();
    	if(checkedOutItems.isEmpty()) {
    		System.out.println("You currently have no items checked out.");
    	} else {
    		System.out.println("Checked out items: ");
    		for(LibraryMaterial item : checkedOutItems) {
    			System.out.println(item.getTitle());
    		}
    	}
    }
    //adding checked out items
    public void addCheckedOutItem(LibraryMaterial item) {
        checkedOutItems.add(item);
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

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    
    public String getName() {
    	return this.name;
    }
}