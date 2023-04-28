package itemsPackage;

import peoplePackage.Librarian.CheckOutable;
import peoplePackage.Member;

public abstract class LibraryMaterial {
	private static boolean checkedOut;
	private String checkedOutBy;
	private static int nextId = 1;
	protected String title;
	protected String ID;
	protected String section;
	protected String publicationDate;
	
	public LibraryMaterial(String title, String section, String publicationDate) {
		this.title = title;
		this.ID = String.valueOf(nextId++);
		this.section = section;
		this.publicationDate = publicationDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getID() {
		return this.ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	public String getPublicationDate() {
		return this.publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	//returning the type of material ie. book/dvd/journal/newspaper
    public String getType(LibraryMaterial material) {
        if (material instanceof Books) {
            return "Book";
        } else if (material instanceof DVD) {
            return "DVD";
        } else if (material instanceof Journal) {
            return "Journal";
        } else if (material instanceof Newspaper) {
            return "Newspaper";
        } else {
            return "Unknown";
        }
    }
    
    public String getType() {
    	return this.getType();
    }
    
    //some checkout methods
    public boolean isAvailable() {
        return !checkedOut;
    }
    
    public  boolean isCheckedOut() {
        return checkedOut;
    }
    
    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
    
//	Override??
	public String toString() {
        return "LibraryMaterial [title=" + title + ", ID=" + ID + ", section=" + section + ", publicationDate=" + publicationDate + "]";
    }
}