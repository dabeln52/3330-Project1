package itemsPackage;

import universityPackage.LibraryMaterial;

public class Newspaper extends LibraryMaterial{
    private String publisher;

    public Newspaper(String title, String publisher, String ISSN, String section, String publicationDate) {
    	super(title, ISSN, section, publicationDate);
    	this.publisher = publisher;
    }

    public String getPublisher() {
    	return this.publisher;
    }
    public void setPublisher(String publisher) {
    	this.publisher = publisher;
    }
    
//    @Override
    public String toString() {
        return "Newspaper [publisher=" + publisher + ", title=" + getTitle() + ", ISSN=" + getID() + ", section=" + getSection() + ", publicationDate=" + getPublicationDate() + "]";
    }
}