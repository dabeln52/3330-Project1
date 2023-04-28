package universityPackage;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import itemsPackage.LibraryMaterial;
import itemsPackage.*;
//import peoplePackage.Librarian.LibraryMaterial;
import peoplePackage.Librarian.CheckOutable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Collection{
	private ArrayList<LibraryMaterial> items;
	
	public Collection() {
		items = new ArrayList<LibraryMaterial>();
	}
	
	public Collection(LibraryMaterial[] materials) {
		items = new ArrayList<>();
		for(LibraryMaterial material : materials) {
			items.add(material);
		}
	}
	
	public void addItem(LibraryMaterial item) {
		items.add(item);
	}
	public void removeItem(String index) {
		items.remove(index);
	}
	
	public LibraryMaterial getItem(int index) {
		return items.get(index);
	}
	
	public List<LibraryMaterial> getItems() {
		return items;
	}

	
//	displaying every item in a collection
	public static void displayCollection(List<LibraryMaterial> collection) {
	    System.out.println("Items in Collection:");
	    System.out.println("--------------------");
	    for (LibraryMaterial item : collection) {
	        System.out.println(item.toString());
	        System.out.println("--------------------");
	    }
	}
	
	//this is not working properly 
    public static void displayCheckedOutBooks(List<LibraryMaterial> materials) {
    	System.out.println("Currently checked out items: ");
    	System.out.println("-----------------------------");
    	for(LibraryMaterial material : materials) {
    		if(material.isCheckedOut()) {
    			System.out.println(material.toString());
    			System.out.println("-----------------------------");
    		}
    	}
    }
    //im hoping this works but dont know for sure
    public static void returnMaterial(String materialID, List<LibraryMaterial> materials) {
    	LibraryMaterial materialToReturn = findMaterial(materialID, materials);
    	if(materialToReturn != null && materialToReturn.isCheckedOut()) {
    		materialToReturn.setCheckedOut(false);
    		System.out.println("Material returned successfuly");
    	} else if(materialToReturn != null && !materialToReturn.isCheckedOut()) {
    		System.out.println("Material with ID " + materialID + " is not checked out");
    	} else {
    		System.out.println("Material with ID " + materialID + " not found");
    	}
    }
	
    
//    this works, basically removing an item from a collection
	public static List<LibraryMaterial> removeMaterial(String materialID, List<LibraryMaterial> materials){
		LibraryMaterial materialToRemove = findMaterial(materialID, materials);
		if(materialToRemove != null) {
			materials.remove(materialToRemove);
			System.out.println("Material removed succesfully");
		} else {
			System.out.println("Material with ID " + materialID + " not found.");
		}
		return materials;
	}
//	finding a material, needed for removeMaterial
	public static LibraryMaterial findMaterial(String materialID, List<LibraryMaterial> materials) {
		for (LibraryMaterial material : materials) {
			if(material.getID().equals(materialID)) {
				return material;
			}
		}
		return null;
	}
	
}
