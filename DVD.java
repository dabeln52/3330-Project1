public class DVD{
    private String title;
    private String director;
    private String producer;
    private int releaseYear;
    // ISBN should look like "978-0-231-67365-0"
    private String ISBN;
    private String dvdID;

    public void DVD(String title, String director, String producer, int releaseYear, String ISBN, String dvdID){
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.releaseYear = releaseYear;
        this.ISBN = ISBN;
        this.dvdID = dvdID;
    }

    // getters and setters
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDirector(){
        return this.director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public String getProducer(){
        return this.producer;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public String getISBN(){
        return this.ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getDVDID(){
        return this.dvdID;
    }
    public void setDVDID(int dvdID){
        this.dvdID = dvdID;
    }