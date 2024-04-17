import java.util.ArrayList;
import java.util.Date;
public class Student {
    private String fname;
    private String lname;
    private String email;
    private String adres;
    private String phoneNumber;
    private Date dateOfBirth;
    private String indexNumber;
    static ArrayList<Student>students = new ArrayList<Student>();
    public Student (String fname, String lname, String email, String adres, String phoneNumber, Date dateOfBirth){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        Student.students.add(this);
        this.indexNumber = "s" + students.size();
    }

    public void enrollStudent(StudyProgramme stProgramme){

    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getAdres() {
        return adres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
