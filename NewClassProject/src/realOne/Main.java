package realOne;
import itemsPackage.*;
import universityPackage.*;
import peoplePackage.*;

import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	
	public static void mainMenu(){
      System.out.println("University of Java Library System");
      System.out.println("Menu Options");
      System.out.println("1. New Membership");
      System.out.println("2. Check Members");
      System.out.println("3. remove Membership");
      
      System.out.println("4. New Collection");
      System.out.println("5. Display Collection");
      System.out.println("6. Remove Collection"); 
      
      System.out.println("7. New Employee");
      System.out.println("8. Check Employees");
      System.out.println("9. Remove Employee");
      
      System.out.println("7. Return Item");
      System.out.println("8. Check overdues");
      System.out.println("9. Quit");
      System.out.println("");
	}
	
	public static Member newMemberEvent(Scanner scn){
		System.out.println("Enter Membership info: ");
		System.out.print("Enter Member Name: ");
		String name = scn.nextLine();
		System.out.print("Enter Member Address: ");
		String address = scn.nextLine();
		System.out.print("Enter Member Date of Birth: ");
		String dob = scn.nextLine();
		System.out.print("Enter Member email: ");
		String email = scn.nextLine();
		System.out.print("Enter Member SSN: ");
		String ssn = scn.nextLine();
		System.out.print("Enter Membership type (Student/Professor/External): ");
		String memtype = scn.nextLine();
		System.out.print("Creating a new member...\n");
		Member mem = new Member(name,address,dob,email,ssn,memtype);
//		Save the new member into the membership database
		mem.saveTo("membershipdatabasefile.txt");
		System.out.println("\nNew Member Successfully Saved to 'membershipdatabasefile.txt'\n"); 
		return new Member(name,address,dob,email,ssn,memtype);
	}
	
	public static LibraryMaterial newCollectionEvent(Scanner scanner) {
		System.out.println("Enter Collection info: ");
		System.out.print("Enter Collection Title: ");
		String title = scanner.nextLine();
		System.out.print("Enter Collection Section: ");
		String section = scanner.nextLine();
		System.out.print("Enter Collection Publication Date: ");
		String publicationDate = scanner.nextLine();
		System.out.print("Enter Colelction Type (Book/DVD/Journal/Newspaper): ");
		String collectionType = scanner.nextLine();
		
		switch(collectionType.toLowerCase()) {
			case "book":
				System.out.println("Enter Book Author: ");
				String author = scanner.nextLine();
				System.out.print("Enter Book Publisher: ");
				String publisher = scanner.nextLine();
				System.out.print("Enter Book ISBN: ");
				String ISBN = scanner.nextLine();
				Books book = new Books(title, section, publicationDate, author, publisher, ISBN);
				book.saveTo("BookDatabaseFile.txt");
				System.out.println("\nNew Book Successfully Saved to 'BookDatabaseFile.txt'\n");
				return book;
			case "dvd":
				System.out.println("Enter DVD Director: ");
				String director = scanner.nextLine();
				System.out.println("Enter DVD runtime: ");
				String runtime = scanner.nextLine();
				DVD dvd = new DVD(title, section, publicationDate, director, runtime);
				dvd.saveTo("DvdDatabaseFile.txt");
				System.out.println("\nNew DVD Successfully Saved to 'dvddatabasefile.txt'\n"); 
				return dvd;
			case "journal":
				System.out.println("Enter Journal Volume: ");
				int volume = scanner.nextInt();
				System.out.println("Enter Journal Issue: ");
				int issue = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Journal Publisher");
				String editor = scanner.nextLine();
				Journal journal = new Journal(title, section, publicationDate, volume, issue, editor);
				journal.saveTo("JournalDatabaseFile.txt");
				System.out.println("\nNew Journal Successfully Saved to 'JournalDatabaseFile.txt'\n");
				return journal;
			case "newspaper":
				System.out.println("Enter Newspaper Publisher: ");
				String npPublisher = scanner.nextLine();
				Newspaper newspaper = new Newspaper(title, section, publicationDate, npPublisher);
				newspaper.saveTo("NewspaperDatabaseFile.txt");
				System.out.println("\nNew Journal Successfully Saved to 'NewspaperDatabaseFile.txt'\n");
				return newspaper;
				
			default:
				System.out.println("Invalid Collection Type.");
				return null;	
		}
	}
	
	public static Employee newEmployeeEvent(Scanner scn) {
	    System.out.println("Enter Employee info: ");
	    System.out.print("Enter Employee Name: ");
	    String name = scn.nextLine();
	    System.out.print("Enter Employee Address: ");
	    String address = scn.nextLine();
	    System.out.print("Enter Employee Date of Birth: ");
	    String dob = scn.nextLine();
	    System.out.print("Enter Employee email: ");
	    String email = scn.nextLine();
	    System.out.print("Enter Employee SSN: ");
	    String ssn = scn.nextLine();
	    System.out.print("Enter Employee Job Title (Librarian/Technician): ");
	    String jobTitle = scn.nextLine();
	    System.out.print("Creating a new employee...\n");
	    Employee emp = new Employee(name,address,dob,email,ssn,jobTitle);
	    System.out.print("The employee ID is: "+emp.getEmpID());
	    //Save the new employee into the employee database
	    emp.saveTo("employeedatabasefile.txt");
	    System.out.println("\nNew Employee Successfully Saved to 'employeedatabasefile.txt'\n"); 
	    return emp;
		
	}
	
	
	public static void main(String[] args) {
		
		List<Member> memberList = new ArrayList<>();
		List<Employee> employeeList = new ArrayList<>();
		List<LibraryMaterial> collectionList = new ArrayList<>();
		Library library = new Library();
		Librarian librarian = new Librarian();

		
//		test classes
		LibraryMaterial material1 = new Books("The Great Gatsby", "B001", "Fiction", "1925-04-10", "F. Scott Fitzgerald","123");
		LibraryMaterial material2 = new Newspaper("The New York Times", "News", "2022-05-01", "Daily");
		LibraryMaterial material3 = new Journal("Nature", "Science", "2022-04-15",1,2,"Weekly");
		LibraryMaterial material4 = new DVD("Inception", "D001", "Movie", "2010-07-16", "Christopher Nolan");
		Member member1 = new External("John Smith", "123 Main St", "1985-01-01", "john.smith@email.com", "123-45-6789","External");
		Employee employee1 = new Librarian("Jane Doe", "123 Main St", "1980-01-01", "jane.doe@email.com","222-222-2222","Librarian");
		Employee employee2 = new Technician("Bob Smith", "456 Elm St", "1975-01-01", "bob.smith@email.com", "987-65-4321","Technician");
		Member member2 = new Student("Alice Johnson", "789 Oak St", "2000-01-01", "alice.johnson@email.com","222-222-2222","Student");
		Member member3 = new Professor("David Lee", "101 Maple St", "1970-01-01", "david.lee@email.com","222-222-2222", "Professor");
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		employeeList.add(employee1);
		employeeList.add(employee2);
		collectionList.add(material1);
		collectionList.add(material2);
		collectionList.add(material3);
		collectionList.add(material4);
//		end of test classes
		
		
//		display the main menu
		Main.mainMenu();
//		checking to see what the user wants to do
		System.out.print("Enter your option number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
//		breaking it down into cases
        while(true){
   
        	switch (option) {
        	//new member
        		case 1:
        			Member member = newMemberEvent(scanner);
        			memberList.add(member);
       	            break;
       	    //list of members
        		case 2:
        			System.out.println("List of Members");
        			for(Member m : memberList) {
        				Member.displayMembers(m);
        			}
        			break;
//        			removing members
        		case 3: 
        			//not the best but works for now, should probably have it go into the file and delete the member
        			System.out.println("Enter member ID to remove: ");
        		    int idToRemove = scanner.nextInt();
        		    boolean removed = false;
        		    for(Member memberr : memberList) {
        		        if(memberr.getID() == idToRemove) {
        		            memberList.remove(memberr);
        		            System.out.println("Member with ID " + idToRemove + " has been removed.");
        		            removed = true;
        		            break;
        		        }
        		    }
        		    if(!removed) {
        		        System.out.println("Member with ID " + idToRemove + " was not found in the database.");
        		    }
        		    break;
//        		    adding a collection ie. book/dvd/newspaper/journal
        		case 4: 
        			LibraryMaterial collection = newCollectionEvent(scanner);
        			collectionList.add(collection);
        			break;
//        			displaying all the collections
        		case 5:
        			Collection.displayCollection(collectionList);
        			break;
//        			removing a item from collection
        		case 6:
        			System.out.println("Enter the ID of the item you want to remove: ");
        			String removeID = scanner.nextLine();
        			
        			collectionList = Collection.removeMaterial(removeID, collectionList);
        			break;
//        			adding employee
        		case 7:
        			Employee employee = newEmployeeEvent(scanner);
        			employeeList.add(employee);
        			break;
//        			displaying employees
        		case 8:
        			System.out.println("List of Employees");
        			for(Employee e : employeeList) {
        				Employee.displayEmployee(e);
        			}
        			break;
//        			removing employees
        		case 9:
        			//not the best but works for now, should probably have it go into the file and delete the member
        			System.out.println("Enter Employee ID to remove: ");
        		    int idToRemovee = scanner.nextInt();
        		    boolean removedd = false;
        		    for(Employee employeee : employeeList) {
        		        if(employeee.getEmpID() == idToRemovee) {
        		            employeeList.remove(employeee);
        		            System.out.println("Member with ID " + idToRemovee + " has been removed.");
        		            removed = true;
        		            break;
        		        }
        		    }
        		    if(!removedd) {
        		        System.out.println("Member with ID " + idToRemovee + " was not found in the database.");
        		    }
        		    break;
//        		    Member checking out a book
        		case 10:
        			System.out.print("Enter the ID of the member: ");
        			String memberId = scanner.nextLine();
        
        			Member memberr = library.findMember(memberList, memberId);
        			if(memberr == null) {
        				System.out.println("Member not found");
        				break;
        			}
        			
        			System.out.println("Current checked out items: ");
        			memberr.displayCheckedOutItems();
        			
        			System.out.print("Enter the ID of the material to be checked out: ");
        			String materialId = scanner.nextLine();
        			
        			LibraryMaterial material = library.findMaterial(materialId, collectionList);
        			if(material == null) {
        				System.out.println("Item not found");
        				break;
        			}
        			
        			librarian.checkOut(material, memberr);
        			
        			break;

//        			displaying all checked out books
        		case 11:
//        			so when you first run case 11 it will display no items which is true, when you go to check out a book and then try to run this case again it will display ALL items in the collection.
        			Collection.displayCheckedOutBooks(collectionList);
        			break;
        			
        		case 12:
//        			dont think this is working but could be wrong
        			System.out.print("Enter the ID of the item to return: ");
        			String returnID = scanner.nextLine();
        			Collection.returnMaterial(returnID, collectionList);
        			break;
//        			return books
        			
        		case 13:
//        			check overdue books
        		case 14:
        			System.out.println("GoodBye");
        			System.exit(0);
        			break;
        		default:
        			System.out.println("Invalid operator.");
                    continue;
        	}
        	System.out.println("Enter your option number: ");
        	option = scanner.nextInt();
        	scanner.nextLine();
        }
	}
}


//    public static void newCollectionEvent(){};
//    public static void newRemoveMemberEvent(){};
//    public static void newRemoveCollectionEvent(){};
//    public static void newEmployeeEvent(){};
//    public static void newBorrowsEvent(){};
//    public static void newReturnEvent(){};
//    public static void newCheckOverdues(){};
//    //You are free to implememnt other events that you see needs to be implemented
//
//    public static void main(String [] args){
//        ProjectMain.mainMenu();
//
//        System.out.print("Enter your option number: ");
//        Scanner scanner = new Scanner(System.in);
//        int option = scanner.nextInt();
//        while(true){
//
//            switch (option) {
//                case 1:
//                    ProjectMain.newMemberEvent();
//                    break;
//                case 2:
//                    ProjectMain.newCollectionEvent();
//                    break;
//                case 3:
//                    ProjectMain.newRemoveMemberEvent();
//                    break;
//                case 4:
//                    ProjectMain.newRemoveCollectionEvent();
//                    break;
//                case 5:
//                    ProjectMain.newEmployeeEvent();
//                    break;
//                case 6:
//                    ProjectMain.newBorrowsEvent();
//                    break;
//                case 7:
//                    ProjectMain.newReturnEvent();
//                    break;
//                case 8:
//                    ProjectMain.newCheckOverdues();
//                    break;
//                case 9:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid operator.");
//                    continue;
//            }
//        }
//
//
//
//
//    }
//}
