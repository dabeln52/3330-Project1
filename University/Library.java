import java.sql.Date;

public class Library{

    private String libName;
    private String libAddress;
    private String libPhone;
    private String libEmail;
    private List<Collection> collections;
    private List<Employee> employees;
    private List<Member> members;
    private List<Borrowing> borrowings;

    public Library(String libName, String libAddress, String libPhone, String libEmail, int libEmployee, int libMember){
        this.libName = libName;
        this.libAddress = libAddress;
        this.libPhone = libPhone;
        this.libEmail = libEmail;
        this.libEmployee = libEmployee;
        this.libMember = libMember;
    }

    // getters and setters
    public String getLibName(){
        return libName;
    }
    public void setLibName(String libName){
        this.libName = libName;
    }

    public String getLibAddress(){
        return libAddress;
    }
    public void setLibAddress(String libAddress){
        this.libAddress = libAddress;
    }

    public String getLibPhone(){
        return libPhone;
    }
    public void setLibPhone(String libPhone){
        this.libPhone = libPhone;
    }

    public String getLibEmail(){
        return libEmail;;
    }
    public void setLibEmail(String libEmail){
        this.libEmail = libEmail;
    }

    public int getLibEmployee(){
        return libEmployee;
    }
    public void setLibEmployee(int libEmployee){
        this.libEmployee = libEmployee;
    }

    public int getLibMember(){
        return libMember;
    }
    public void setLibMember(int libMember){
        this.libMember = libMember;
    }



    // functions for Library 
    public void addCollection(Collection collection) {
        this.collections.add(collection);
    }

    public void removeCollection(Collection collection) {
        this.collections.remove(collection);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMember(Member member) {
        this.members.remove(member);
    }

    public void addBorrowing(Borrowing borrowing) {
        this.borrowings.add(borrowing);
    }

    public void removeBorrowing(Borrowing borrowing) {
        this.borrowings.remove(borrowing);
    }

}