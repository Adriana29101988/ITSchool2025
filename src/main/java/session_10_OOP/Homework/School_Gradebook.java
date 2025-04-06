package session_10_OOP.Homework;

import java.util.ArrayList;
import java.util.List;

class School_Gradebook {
    // creez clasa Stundet
    class Student {
      private String name;
      private String studentId;
      private List<Double> grades;
    }
    //creez constructorul pentru clasa Student

    public void School_Gradebook(String name, String studentId){
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();

    }
    // metoda pentru a adauga o nota
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
    // metoda ca sa aflam informatii despre elev
    public String getStudentInfo() {
        return "Nume: " + name + ", ID: " + studentId + ", Medie: " + calculateAverage();
    }
}
// contructor pt lista elevi
class Gradebook {
    private List<School_Gradebook.Student> students;

    // Constructor pentru Gradebook
    public Gradebook() {
        students = new ArrayList<>();
    }

    // Metoda pentru a adăuga un elev
    public void addStudent(Student student) {
        students.add(student);
    }

    // Metoda pentru a vizualiza lista de elevi și mediile lor
    public void viewStudents() {
        for (Student student : students) {
            System.out.println(student.getStudentInfo());
        }
    }
}

// clasa MAin ca sa le afisam
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Gradebook
        Gradebook gradebook = new Gradebook();

        // Crearea unor elevi
        School_Gradebook.Student student1 = new Student("Ion Popescu", "S001");
        Student student2 = new Student("Maria Ionescu", "S002");

        // Adăugarea de note la elevi
        student1.addGrade(8.5);
        student1.addGrade(9.0);
        student2.addGrade(7.5);
        student2.addGrade(8.0);

        // Adăugarea elevilor la carnetul de note
        gradebook.addStudent(student1);
        gradebook.addStudent(student2);

        // Vizualizarea elevilor și mediilor lor
        gradebook.viewStudents();
    }
}

