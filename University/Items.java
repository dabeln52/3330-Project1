import java.sql.Date;

public class Item{

    private String type;
    private String IdNum;
    private String isbNum;
    private String title;
    private String author;
    private Date publicationDate;
    private String location;
    private boolean available; 
    private Collection collection;

    public Item(String type, String IdNum, String isbNum, String title, String author, Date publicationDate, String location){
        this.type = type;
        this.IdNum = IdNum;
        this.isbNum = isbNum;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.location = location;
        this.available = true;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getIdNum(){
        return IdNum;
    }
    public void setIdNum(String IdNum){
        this.IdNum = IdNum;
    }

    public String getIsbNum(){
        return isbNum;
    }
    public void setIsbNum(String isbNum){
        this.isbNum = isbNum;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor{
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public Date getPublicationDate{
        return publicationDate;
    }
    public void setPublicationDate(Date publicationDate){
        this.publicationDate = publicationDate;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    public Collection getCollection(){
        return collection;
    }
    public void setCollection(Collection collection){
        this.collection = collection;
    }