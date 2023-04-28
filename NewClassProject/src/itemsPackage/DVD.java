package itemsPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DVD extends LibraryMaterial{
	private String director;
	private String runtime;
	
	public DVD(String title, String section, String publicationDate, String director, String runtime) {
		super(title, section, publicationDate);
		this.director = director;
		this.runtime = runtime;
	}
	
//	getters and setters
	public String getDirector() {
		return this.director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getRuntim() {
		return this.runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
	public String getTitle() {
    	return this.title;
    }
	
//	override toStirng to look better
	public String toString() {
	    return "DVD" + "\n" +
	           "Title: " + title + "\n" +
	           "ID: " + ID + "\n" +
	           "Section: " + section + "\n" +
	           "Publication Date: " + publicationDate + "\n" +
	           "Director: " + director + "\n" +
	           "Runtime: " + runtime + " minutes" + "\n";
	}
	
	public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("Title: " + this.title + "\n");
    		writer.write("ID: " + this.ID + "\n");
    		writer.write("Section: " + this.section + "\n");
    		writer.write("Publication Date: " + this.publicationDate + "\n");
    		writer.write("Director: " + this.director + "\n");
    		writer.write("Runtime: " + this.runtime + "\n");
    		writer.close();
    	} catch(IOException e) {
    		System.out.println("An error occured while writeing to the file");
    		e.printStackTrace();
    	}
    }
}
    