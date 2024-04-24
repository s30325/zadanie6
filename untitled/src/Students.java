import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Students {
    private int currentSemester;
    public static void promoteAllStudents(){
        for(int i = 0; i < Student.students.size(); i++){
            Student.students.get(i).promoteNextSemester();
        }
    }
    public static void displayInfoAboutAllStudents(){
        for(int i = 0; i<Student.students.size(); i++){
            System.out.println("Imię: "+ Student.students.get(i).getFname());
            System.out.println("Nazwisko: "+ Student.students.get(i).getLname());
            System.out.println("Adres email: "+ Student.students.get(i).getEmail());
            System.out.println("Adres zamieszkania: "+ Student.students.get(i).getAdres());
            System.out.println("Numer telefonu: "+ Student.students.get(i).getPhoneNumber());
            System.out.println("Data urodzenia: "+ Student.students.get(i).getDateOfBirth());
            System.out.println("Numer indeksu: "+ Student.students.get(i).getIndexNumber());
            System.out.println("Status studenta: "+ Student.students.get(i).getStudentStatus());
            System.out.println("Aktualny semestr: "+ Student.students.get(i).getCurrentSemester());
            System.out.println("Program studiow: "+ Student.students.get(i).getCurrentStudyPrograme());

        }
    }
}
