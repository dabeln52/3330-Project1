package universityPackage;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import itemsPackage.Books;
import itemsPackage.DVD;
import itemsPackage.Journal;
import itemsPackage.Newspaper;
import peoplePackage.Employee;
import peoplePackage.Member;

import java.util.Collection;
import java.util.Map;

public class Library{
	private Collection<Books> books;
	private Collection<Newspaper> newspapers;
	private Collection<DVD> dvds;
	private Collection<Journal> journals;
	
	private Map<String, Employee> employees;
	private Map<String, Member> members;
	private Map<String, BorrowedItems> borrowedItems;
	
	
	
	
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
    
    
    
    
    // functions for Library 
//    public void addCollection(Collection collection) {
//        this.collections.add(collection);
//    }
//
//    public void removeCollection(Collection collection) {
//        this.collections.remove(collection);
//    }
//
//    public void addEmployee(Employee employee) {
//        this.employees.add(employee);
//    }
//
//    public void removeEmployee(Employee employee) {
//        this.employees.remove(employee);
//    }
//
//    public void addMember(Member member) {
//        this.members.add(member);
//    }
//
//    public void removeMember(Member member) {
//        this.members.remove(member);
//    }
//
//    public void addBorrowing(Borrowing borrowing) {
//        this.borrowings.add(borrowing);
//    }
//
//    public void removeBorrowing(Borrowing borrowing) {
//        this.borrowings.remove(borrowing);
//    }

}