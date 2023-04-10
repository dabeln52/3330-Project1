import java.sql.Date;

public class Inventory{
    private List<Book> books;

    // constuctor for books
     public Inventory(String LocationAddress, String LocationName, String storeHours, String ContactInfo, String StoreReviews. List<Book> books) {
        super(LocationAddress, Locationname, storehours, ContactInfo, StoreReviews)
        this.books = new ArrayList<Book>();
    }

    // adding books to the inventory
    public void addBook(Book book){
        this.books.add(book);
    }
    // if you need to remove a book
    public void removeBook(Book book){
        this.books.remove(book);
    }
    // if you need to find a book
    public Book findBook(int bookNum){
        for(Book book: this.books){
            if(book.getBookId() == bookID){
                return book;
            }
        }
    }
    // searches the books based on keywords, this should return the right book if the user enters in any keyword that is in the title,
    // the author, or the genre
    public List<Book> searchBooks(String keyword){
        List<Book> searchResults = new ArrayList<Book>();
        for(Book book:this.books){
            if(book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getGenre().contains(keyword)){
                searchResults.add(book);
            })
        }
        return searchResults;
    }
}
