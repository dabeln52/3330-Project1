package peoplePackage;
import java.util.ArrayList;
import java.util.List;

import itemsPackage.LibraryMaterial;

public class Librarian extends Employee {
    private ArrayList<Member> members;
    private Library library;
    
    public Librarian() {
    	
    }
    public Librarian(Library library) {
    	this.library = library;
    }
    public Librarian(String name, String address, String dob, String email, String ssn, String jobTitle) {
    	super(name,address,dob,email,ssn,jobTitle);
    }
    
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
    public String getName() {
    	return this.name;
    }


    
//    Checkout methods 
    public void checkOut(itemsPackage.LibraryMaterial material, peoplePackage.Member member) {
    	if(!material.isAvailable()) {
    		System.out.println("Sorry, this item is currently checked out.");
    		return ;
    	}
    	
    	material.setCheckedOut(true);
    	
    	member.addCheckedOutItem(material);
    	
    	System.out.println(material.getTitle() + " has been checked out by " + member.getName());

    }
    
//    this is just checking to see if an item has already been checked out
    public interface CheckOutable {
    	boolean isCheckedOut();
    	void setCheckedOut(boolean checkedOut);
    }    
    
    //bringing in an LibraryMaterial class to help with functionality 
    public abstract class LibraryMaterial implements CheckOutable {
    	protected String title;
    	protected String ID;
    	protected String section;
    	protected String publicationDate;
    	protected boolean checkedOut;
    	protected String checkedOutBy;
    	
    	public LibraryMaterial(String title, String ID, String section, String publicationDate) {
    		this.title = title;
    		this.ID = ID;
    		this.section = section;
    		this.publicationDate = publicationDate;
    		this.checkedOut = false;
    		this.checkedOutBy = "";
    	}
    	
    	public boolean isAvailable() {
    		return !checkedOut;
    	}
    	
    	public boolean isCheckedOut() {
    		return checkedOut;
    	}
    	
    	public void setCheckedOut(boolean checkedOut) {
    		this.checkedOut = checkedOut;
    	}
    	
    	public String getTitle() {
    		return this.title;
    	}
    	
    	public String getID() {
    		return this.ID;
    	}
    }
    
    //same thing with the library material method, just helping with functionality 
    public class Member {
    	private ArrayList<CheckOutable> checkedOutItems;
    	
    	public void addCheckedOutitem(LibraryMaterial item) {
            if(checkedOutItems == null) {
                checkedOutItems = new ArrayList<>();
            }
            checkedOutItems.add(item);
            item.setCheckedOut(true);
        }
    	
    	public String getName() {
    		return this.getName();
    	}
    	public String getID() {
    		return this.getID();
    	}
    }
    
    //same thing with the library material method, just helping with functionality 
    public class Library {
    	private ArrayList<LibraryMaterial> materials;
    	
    	public void Libray() {
    		this.materials = new ArrayList<LibraryMaterial>();
    	}
 
	    public boolean isAvailable(String ID) {
	    	for(LibraryMaterial item : materials) {
	    		if(item.getID().equals(ID)) {
	    			if(item.isCheckedOut()) {
	    				return false;
	    			} else {
	    				return true;
	    			}
	    		}
	    	}
	    	return false;
	    }
    }


}
