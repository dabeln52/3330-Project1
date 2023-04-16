package universityPackage; 

public abstract class LibraryMaterial {
	protected String title;
	protected String ID;
	protected String section;
	protected String publicationDate;
	
	public LibraryMaterial(String title, String ID, String section, String publicationDate) {
		this.title = title;
		this.ID = ID;
		this.section = section;
		this.publicationDate = publicationDate;
	}
	
	public String getTitle() {
		return this.title;
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
	
//	Override??
	public String toString() {
        return "LibraryMaterial [title=" + title + ", ID=" + ID + ", section=" + section + ", publicationDate=" + publicationDate + "]";
    }
	
}