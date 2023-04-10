import java.sql.Date;

public class Store{
    private String LocationAddress; 
    private String LocationName; 
    private String StoreHours;
    private String ContactInfo;
    private double StoreReviews; 

     public Store(String LocationAddress, String LocationName, String storeHours, String ContactInfo, String StoreReviews) {
        this.LocationAddress = LocationAddress;
        this.LocationName = LocationName;
        this.storeHours = storeHours;
        this.ContactInfo = ContactInfo;
        this.StoreReviews = StoreReviews;
    }

    public String getLocationAdrress(){
        return this.LocationAddress;
    }
    public void setLocationAddress(String LocationAddress){
        this.LocationAddress = LocationAddress;
    }

    public String getLocationName(){
        return this.LocationName;
    }
    public void setLocationName(String LocationName){
        this.LocationName = LocationAddress;
    }

    public String getStoreHours(){
        return this.storeHours;
    }
    public void setGetHours(String storeHours){
        this.storeHours = storeHours;
    }

    public String getContactInfo(){
        return this.ContactInfo;
    }
    public void setContactInfo(String ContactInfo){
        this.ContactInfo = ContactInfo;
    }

    public double getStoreReviews(){
        return this.Reviews;
    }
    public void setStoreReviews(double StoreReviews){
        this.StoreReviews = StoreReviews;
    }
    
}
