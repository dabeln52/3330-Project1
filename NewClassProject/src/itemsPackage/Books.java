package itemsPackage;

public class Books{
	private String id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    public void Book(String title, String author, String publisher, String id, String isbn){
        this.title = title;
        this.author = author;
        this.publisher=publisher;
        this.id = id;
        this.isbn = isbn;
    }
    
//    getters and setters
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
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
    public String getID(){
        return this.id;
    }
    public void setID(String id){
        this.id = id;
    }
    
//    other methods
    public void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + isbn);
    }
}