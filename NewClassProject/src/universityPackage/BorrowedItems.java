package universityPackage;

import itemsPackage.LibraryMaterial;

public class BorrowedItems{
	private LibraryMaterial material;
	private String borrower;
	private String borrowDate;
	private String dueDate;
	
	public BorrowedItems(LibraryMaterial material, String borrower, String borrowDate, String dueDate) {
		this.material = material;
		this.borrower = borrower;
		this.borrowDate = borrowDate;
		this.dueDate = dueDate;
	}
	
	public LibraryMaterial getMaterial() {
		return material;
	}
	public void setMaterial(LibraryMaterial material) {
		this.material = material;
	}
	
	public String getBorrower() {
		return this.borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	public String getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
//	override
	public String toString() {
        return "BorrowedItem{" +
                "material=" + material +
                ", borrower='" + borrower + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}