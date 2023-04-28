package universityPackage;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import itemsPackage.Books;
import itemsPackage.DVD;
import itemsPackage.Journal;
import itemsPackage.LibraryMaterial;
import itemsPackage.Newspaper;
import peoplePackage.Employee;
import peoplePackage.Librarian;
import peoplePackage.Member;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Library{
	private Collection<Books> books;
	private Collection<Newspaper> newspapers;
	private Collection<DVD> dvds;
	private Collection<Journal> journals;
	
	private Map<String, Employee> employees;
	private Map<String, Member> members;
	private Map<String, BorrowedItems> borrowedItems;
	
	
	public Library() {
		this.members = new LinkedHashMap<String, Member>();
	}
	
	public Library(Collection<Books> books, Collection<Newspaper> newspapers, Collection<DVD> dvds,
            Collection<Journal> journals, Map<String, Employee> employees, Map<String, Member> members,
            Map<String, BorrowedItems> borrowedItems) {
		this.books = books;
		this.newspapers = newspapers;
		this.dvds = dvds;
		this.journals = journals;
		this.employees = employees;
		this.members = members;
		this.borrowedItems = borrowedItems;
	}

    // getters and setters
//	collecitons
	public Collection<Books> getBooks() {
		return books;
	}
	public void setBooks(Collection<Books> books) {
		this.books = books;
	}

	public Collection<Newspaper> getNewspapers(){
		return newspapers;
	}
	public void setNewspapers(Collection<Newspaper> newspapers) {
		this.newspapers = newspapers;
	}
	
	public Collection<DVD> getDvds() {
        return dvds;
    }
    public void setDvds(Collection<DVD> dvds) {
        this.dvds = dvds;
    }

    public Collection<Journal> getJournals() {
        return journals;
    }
    public void setJournals(Collection<Journal> journals) {
        this.journals = journals;
    }
    
//    map
    public Map<String, Member> getMembers(){
    	return members;
    }
    public void setMembers(Map<String, Member> members) {
    	this.members = members;
    }
    public Map<String, Employee> getEmployees(){
    	return employees;
    }
    public void setEmployees(Map<String, Employee> employees) {
    	this.employees = employees;
    }
    public Map<String, BorrowedItems> getBorrowedItems(){
    	return borrowedItems;
    }
    public void setBorrowedItems(Map<String, BorrowedItems> borrowedItems) {
    	this.borrowedItems = borrowedItems;
    }

    //finding members
    public Member findMember(List<Member> members, String ID) {
    	for(Member member : members) {
    		if(member.getID() == Integer.parseInt(ID)) {
    			return member;
    		}
    	}
    	return null;
    }
    //finding LibraryMaterial ie. books/newspapers/dvd/journals
    public LibraryMaterial findMaterial(String materialID, List<LibraryMaterial> materials) {
    	for(LibraryMaterial material : materials) {
    		if(material.getID().equals(materialID)) {
    			return material;
    		}
    	}
    	return null;
    }
    
    //adding the books and the rest to a collection
    public Collection<LibraryMaterial> getMaterials() {
        List<LibraryMaterial> materials = new ArrayList<>();
        materials.addAll(books);
        materials.addAll(dvds);
        materials.addAll(journals);
        materials.addAll(newspapers);
        return materials;
    }
    
    //checking to see what type of material the collection is
    public String getType(LibraryMaterial material) {
        if (material instanceof Books) {
            return "Book";
        } else if (material instanceof DVD) {
            return "DVD";
        } else if (material instanceof Journal) {
            return "Journal";
        } else if (material instanceof Newspaper) {
            return "Newspaper";
        } else {
            return "Unknown";
        }
    }
    
    //check out
    public void checkOut(LibraryMaterial material, Member member) {
        Librarian librarian = new Librarian();
        librarian.checkOut(material, member);
    }
}