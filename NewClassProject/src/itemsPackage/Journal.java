package itemsPackage;

import universityPackage.LibraryMaterial;

public class Journal extends LibraryMaterial{
    private int volume;
    private int issue;
    private String publisher;

    public Journal(String title, String ID, String section, String publicationDate, int volume, int issue, String publisher) {
    	super(title, ID, section, publicationDate);
    	this.volume = volume;
    	this.issue = issue;
    	this.publisher = publisher;
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
    
    public String getPublisher() {
    	return this.publisher;
    }
    public void setPublisher(String publisher) {
    	this.publisher = publisher;
    }
    
//    override
    public String toString() {
        return "Journal [title=" + title + ", ID=" + ID + ", section=" + section + ", publicationDate=" + publicationDate + ", volume=" + volume + ", issue=" + issue + ", publisher=" + publisher + "]";
    }
    
}