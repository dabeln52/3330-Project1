package itemsPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Newspaper extends LibraryMaterial{
    private String publisher;

    public Newspaper(String title, String section, String publicationDate, String publisher) {
    	super(title, section, publicationDate);
    	this.publisher = publisher;
    }

    public String getPublisher() {
    	return this.publisher;
    }
    public void setPublisher(String publisher) {
    	this.publisher = publisher;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
//  override toString() to look better
    public String toString() {
        return "Newspaper" + "\n" +
               "Title: " + getTitle() + "\n" +
               "ID: " + getID() + "\n" +
               "Section: " + getSection() + "\n" +
               "Publication Date: " + getPublicationDate() + "\n" +
               "Publisher: " + publisher;
    }
    
    public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("Title: " + this.title + "\n");
    		writer.write("ID: " + this.ID + "\n");
    		writer.write("Section: " + this.section + "\n");
    		writer.write("Publication Date: " + this.publicationDate + "\n");
    		writer.write("Publisher: " + this.publisher + "\n");
    		writer.close();
    	} catch(IOException e) {
    		System.out.println("An error occured while writeing to the file");
    		e.printStackTrace();
    	}
    }
}