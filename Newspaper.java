public class Newspaper{
    private String title;
    private String editor;
    private String publisher;
    private int publicationYear;
    private String ISSN;
    private String newspaperID;

    public void Newspaper(String title, String editor, String publisher, int publicationYear, String ISSN, String newspaperID){
        this.title = title;
        this.editor = editor;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.ISSN = ISSN;
        this.newspaperID = newspaperID;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getEditor(){
        return this.editor;
    }
    public void setEditor(String editor){
        this.editor = editor;
    }

    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public String getISSN(){
        return this.ISSN;
    }
    public void setISSN(String ISSN){
        this.ISSN = ISSN;
    }

    public String getNewspaperID(){
        return this.newspaperID;
    }
    public void setNewspaperID(String newspaperID){
        this.newspaperID = newspaperID;
    }