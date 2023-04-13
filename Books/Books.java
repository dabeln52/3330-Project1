
public class Books{
    private String title;
    private String author;
    private String publisher;
    private int bookNum;
    private String genre;
    private double price;
    // for reviews it should be 1-5 stars  
    private double reviews;

    public void Book(String title, String author, String publisher, int bookNum, String genre, double price, double reviews){
        this.title = title;
        this.author = author;
        this.publisher=publisher;
        this.bookNum = bookNum;
        this.genre = genre;
        this.price = price;
        this.reviews = reviews;
    }

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
    public int getBookNum(){
        return this.bookNum;
    }
    public void setBookNum(int bookNum){
        this.bookNum = bookNum;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getReviews(){
        return this.reviews;
    }
    public void setReviews(double reviews){
        this.reviews = reviews;
    }
}