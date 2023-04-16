package universityPackage;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class Collection{
	private Map<String, LibraryMaterial> items;
	
	public Collection() {
		items = new HashMap<>();
	}
	
	public void addItem(LibraryMaterial item) {
		items.put(item.getID(), item);
	}
	public void removeItem(String id) {
		items.remove(id);
	}
	
	public LibraryMaterial getItem(String id) {
		return items.get(id);
	}
	
	public Map<String, LibraryMaterial> getItems(){
		return items;
	}
}
