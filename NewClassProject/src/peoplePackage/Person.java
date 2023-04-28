package peoplePackage;

public class Person{
    protected String name; 
    protected String address;
    protected String dob; 
    protected String email;
    protected String ssn;
    protected String formattedSSN;
//    = String.format("%s-%s-%s", ssn.substring(0,3), ssn.substring(3,5), ssn.substring(5));

    public Person() {
        this.name = "";
        this.address = "";
        this.dob = "";
        this.email = "";
        this.ssn = "";
        //this.formattedSSN = formatSSN(ssn);
    }

    public Person(String name, String address, String dob, String email, String ssn) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.ssn = ssn;
        
        //this.formattedSSN = formatSSN(ssn);

//        if(this.ssn != null ) {
//        	String lastFourDigits = this.ssn.substring(this.ssn.length() - 4);
//        	System.out.println("Last four digits of SSN: " + lastFourDigits);
//        } else {
//        	this.formattedSSN = "";
//        }
    }

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
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

    private String formatSSN(String ssn) {
        return String.format("%s-%s-%s", ssn.substring(0,3), ssn.substring(3,5), ssn.substring(5));
    }
}