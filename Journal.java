public class Journal{
    private String title;
    private String editor;
    private String publisher;
    // could go further and include actual date
    private int publicationYear;
    private String ISSN;
    private String journalID;

    public void Journal(String title, String editor, String publisher,int publicationYear, String ISSN, String journalID) {
        this.title = title;
        this.editor = editor;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.ISSN = ISSN;
        this.journalID = journalID;
    }

    // getters and setters
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getEditor(){
        return this.editor;
    }
    public void setTitle(String editor){
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

    public String getJournalID(){
        return this.journalID;
    }
    public void setJournalID(String journalID){
        this.journalID = journalID;
    }