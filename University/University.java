import java.sql.Date;

public class University{
    private String Name;
    private String Address;
    private String Phone;
    private String Email;
    private Library library;

     public University(String Name, String Address, String Phone, String Email, Library library) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email; 
        this.library = new library;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getPhone(){
        return Phone;
    }
    public void setPhone(String Phone){
        this.Phone = Phone;
    }

    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getLibrary(){
        return Library;
    }
    public void setLibrary(String Library){
        this.library = library;
    }
    
}
