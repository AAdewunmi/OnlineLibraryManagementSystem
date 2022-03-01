package administrator;

import com.librarymanagementsystem.librarian.Librarian;
import com.librarymanagementsystem.students.Student;
import com.librarymanagementsystem.transactions.UserTransactions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian Adewunmi
 * @date 28/02/2020
 * This class is used to create a new administrator,
 * for registering new students and librarians.
 */

public class Administrator extends UserTransactions {
    String adminUserName = "admin";
    String adminPassword = "admin";
    private List<Librarian> listOfLibrarians;
    private List<Student> listOfStudents;

    public Administrator() {
        this.listOfLibrarians = new ArrayList<>();
        this.listOfStudents = new ArrayList<>();
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    // Create new librarian
    public void createLibrarian(String librarianName, String librarianIDNumber, String librarianEmail){
        Librarian librarian = new Librarian(librarianName, librarianIDNumber, librarianEmail);
        listOfLibrarians.add(librarian);
    }

    // Print list of librarians
    public void printLibrarians(){
        for (Librarian librarian : listOfLibrarians) {
            System.out.println(librarian);
        }
    }

    // Create new student
    public void createStudent(String name, String studentId, String email){
        Student student = new Student(name, studentId, email);
        listOfStudents.add(student);
    }

    // Print list of students
    public void printStudents(){
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}
