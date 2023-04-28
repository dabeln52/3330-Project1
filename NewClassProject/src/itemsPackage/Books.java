package itemsPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Books extends LibraryMaterial{

    private String author;
    private String publisher;
    private String ISBN;

    public Books(String title, String section, String publicationDate, String author, String publisher, String ISBN){
    	super(title, section, publicationDate);
        this.author = author;
        this.publisher=publisher;
        this.ISBN = ISBN;
    }
    
//    getters and setters
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void SetPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    
//    override toString() to display better
    public String toString() {
    	return  "Book" + "\n" +
    			"Title: " + this.getTitle() +
                "\nAuthor: " + this.author +
                "\nPublisher: " + this.publisher +
                "\nISBN: " + this.ISBN +
                "\nID: " + this.getID() +
                "\nSection: " + this.getSection() +
                "\nPublication Date: " + this.getPublicationDate() + "\n";
    }
    
//  displaying the book
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + ISBN);
    }
    
    public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("Title: " + this.title + "\n");
    		writer.write("ID: " + this.ID + "\n");
    		writer.write("Section: " + this.section + "\n");
    		writer.write("Publication Date: " + this.publicationDate + "\n");
    		writer.write("Author: " + this.author + "\n");
    		writer.write("Publisher: " + this.publisher + "\n");
    		writer.write("ISBN: " + this.ISBN + "\n");
    		writer.close();
    	} catch(IOException e) {
    		System.out.println("An error occured while writeing to the file");
    		e.printStackTrace();
    	}
    }
}