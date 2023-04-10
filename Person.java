import java.sql.Date;





public class Person{
    String name; 
    String address;
    Date dob; 
    String email;
    String ssn;
    String formattedSSN = String.format("%s-%s-%s", ssn.substring(0,3), ssn.substring(3,5), ssn.substring(5));
   

    //Getter and Setters for variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFormattedSSN() {
        return formattedSSN;
    }

    public Person(String name, String address, Date dob, String email, String ssn) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.ssn = ssn;
        this.formattedSSN = formatSSN(ssn);
    }
    
    private String formatSSN(String ssn) {
        return String.format("%s-%s-%s", ssn.substring(0,3), ssn.substring(3,5), ssn.substring(5));
    }
    



}