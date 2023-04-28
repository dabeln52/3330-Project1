package itemsPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Journal extends LibraryMaterial{
    private int volume;
    private int issue;
    private String editor;

    public Journal(String title, String section, String publicationDate, int volume, int issue, String editor) {
    	super(title, section, publicationDate);
    	this.volume = volume;
    	this.issue = issue;
    	this.editor = editor;
    }

    // getters and setters
    public int getVolume() {
    	return this.volume;
    }
    public void setVolume(int volume) {
    	this.volume = volume;
    }
    
    public int getIssue() {
    	return this.issue;
    }
    public void setIssue(int issue) {
    	this.issue = issue;
    }
    
    public String getEditor() {
    	return this.editor;
    }
    public void setEditor(String editor) {
    	this.editor = editor;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
//    override to string so it displays better
    public String toString() {
    	
        return  "Journal" + "\n" +
                "Title: " + getTitle() +
                "\nID: " + getID() +
                "\nSection: " + getSection() +
                "\nPublication Date: " + getPublicationDate() +
                "\nVolume: " + volume +
                "\nIssue: " + issue +
                "\nEditor: " + editor;
    }
    
    public void saveTo(String textFile) {
    	try {
    		File file = new File(textFile);
    		FileWriter writer = new FileWriter(file);
    		writer.write("Title: " + this.title + "\n");
    		writer.write("ID: " + this.ID + "\n");
    		writer.write("Section: " + this.section + "\n");
    		writer.write("Publication Date: " + this.publicationDate + "\n");
    		writer.write("Volume: " + this.volume + "\n");
    		writer.write("Issue: " + this.issue + "\n");
    		writer.write("Editor: " + this.editor + "\n");
    		writer.close();
    	} catch(IOException e) {
    		System.out.println("An error occured while writeing to the file");
    		e.printStackTrace();
    	}
    }
    
}