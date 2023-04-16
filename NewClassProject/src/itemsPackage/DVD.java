package itemsPackage;

import universityPackage.LibraryMaterial;

public class DVD extends LibraryMaterial{
	private String director;
	private int runtime;
	
	public DVD(String title, String ID, String section, String publicationDate, String director, int runtime) {
		super(title, ID, section, publicationDate);
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
	
	public int getRuntim() {
		return this.runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
//	override
	public String toString() {
        return "DVD [title=" + title + ", ID=" + ID + ", section=" + section + ", publicationDate=" + publicationDate
                + ", director=" + director + ", runtime=" + runtime + "]";
    }
}
    