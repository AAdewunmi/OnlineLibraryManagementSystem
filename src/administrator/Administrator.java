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
    public void createLibrarian(String librarianName, int librarianIDNumber, String librarianEmail, String librarianUserName, String librarianPassword){
        Librarian librarian = new Librarian(librarianName, librarianIDNumber, librarianEmail, librarianUserName, librarianPassword);
        listOfLibrarians.add(librarian);
    }

    // Remove a librarian
    public boolean removeLibrarian(int librarianIDNumber){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.getLibrarianIDNumber() == librarianIDNumber){
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
    public boolean searchLibrarian(int librarianIDNumber){
        for (Librarian librarian : listOfLibrarians) {
            if (librarian.getLibrarianIDNumber() == librarianIDNumber){
                return true;
            }
        }
        return false;
    }

    // Create new student
    public void createStudent(String name, int studentId, String email, String userName, String password){
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
    public boolean searchStudent(int studentIDNumber){
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentIDNumber){
                return true;
            }
        }
        return false;
    }

    // Remove a student
    public boolean removeStudent(int studentIDNumber){
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentIDNumber){
                listOfStudents.remove(student);
                return true;
            }
        }
        return false;
    }

    // Admin Log in
    public boolean adminLogin(String username, String password){
        if(username.equals("admin") && password.equals("admin")){
            System.out.println("Administrator Login Successful!");
            return true;
        }else {
            System.out.println("Administrator Login Failed!");
        }
        return false;
    }
    // Librarian Log in
    public boolean librarianLogin(String username, String password){
        for (Librarian librarian : listOfLibrarians) {
            if(username.equals(librarian.getLibrarianUserName()) && password.equals(librarian.getLibrarianPassword())){
                System.out.println("Librarian Login Successful!");
                return true;
            }else {
                System.out.println("Librarian Login Failed!");
            }
        }
        return false;
    }
}
