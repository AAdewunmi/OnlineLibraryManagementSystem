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
    String adminUserName;
    String adminPassword;
    private List<Librarian> listOfLibrarians;
    private List<Student> listOfStudents;

    public Administrator() {
        this.listOfLibrarians = new ArrayList<>();
        this.listOfStudents = new ArrayList<>();
        this.adminUserName = "admin";
        this.adminPassword = "admin";
    }

    // Create new librarian
    public void createLibrarian(String librarianName, String librarianIDNumber, String librarianEmail, String librarianUserName, String librarianPassword){
        Librarian librarian = new Librarian(librarianName, librarianIDNumber, librarianEmail, librarianUserName, librarianPassword);
        listOfLibrarians.add(librarian);
    }

    // Remove a librarian
    public boolean removeLibrarian(String librarianIDNumber){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.getLibrarianIDNumber().equals(librarianIDNumber)){
                listOfLibrarians.remove(librarian);
                return true;
            }
        }
        return false;
    }

    // Print list of librarians
    public void printLibrarians(){
        for (Librarian librarian : listOfLibrarians) {
            System.out.println(librarian);
        }
    }

    // Search for a librarian by ID number
    public boolean searchLibrarian(String librarianIDNumber){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.getLibrarianIDNumber().equals(librarianIDNumber)){
                return true;
            }
        }
        return false;
    }

    // Create new student
    public void createStudent(String name, String studentId, String email, String userName, String password){
        Student student = new Student(name, studentId, email, userName, password);
        listOfStudents.add(student);
    }

    // Print list of students
    public void printStudents(){
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }

    // Search for a student by ID number
    public boolean searchStudent(String studentIDNumber){
        for (Student student : listOfStudents) {
            if (student.getStudentId().equals(studentIDNumber)){
                return true;
            }
        }
        return false;
    }

    // Remove a student
    public boolean removeStudent(String studentIDNumber){
        for (Student student : listOfStudents) {
            if (student.getStudentId().equals(studentIDNumber)){
                listOfStudents.remove(student);
                return true;
            }
        }
        return false;
    }
}
