package realOne;
import itemsPackage.*;
import universityPackage.*;
import peoplePackage.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import peoplePackage.Member;

public class Main {

	public static void mainMenu(){
      System.out.println("University of Java Library System");
      System.out.println("Menu Options");
      System.out.println("1. New Membership");
      System.out.println("2. New Collection");
      System.out.println("3. Remove Membership");
      System.out.println("4. Remove Item from Collection");
      System.out.println("5. New Employee");
      System.out.println("6. Borrow Item");
      System.out.println("7. Return Item");
      System.out.println("8. Check overdues");
      System.out.println("9. Quit");
      System.out.println("");
	}
	
//	start of its good, need to bulletproof this tho
	public static void newMemberEvent(){
		Scanner scn = new Scanner(System.in);
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
		System.out.print("The membership ID is: "+mem.getID());
//		Save the new member into the membership database
		mem.saveTo("membershipdatabasefile.txt");
		System.out.println("\nNew Member Successfully Saved to 'membershipdatabasefile.txt'\n"); 
	}
	
	public static void main(String[] args) {
		
//		display the main menu
		Main.mainMenu();
//		checking to see what the user wants to do
		System.out.print("Enter your option number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
//		breaking it down into cases
        while(true){
   
        	switch (option) {
        		case 1:
        			Main.newMemberEvent();
       	            break;
        		case 2:
        			//ProjectMain.newCollectionEvent();
        			break;
        		case 9:
        			System.exit(0);
        			break;
        		default:
        			System.out.println("Invalid operator.");
                    continue;
        	}
        	System.out.println("Enter your option number: ");
        	option = scanner.nextInt();
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
