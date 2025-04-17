package Session16_Hash._Homeweork;

import java.util.Objects;

public class Student {
    //Create a Student class with name, age, studentId, and email fields

    private String name;
    private int age;
    private String email;
    private String studentId;

    // Contructor

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.studentId = studentId;
    }

    //Implement the equals() method to check all fields except the studentId.

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}
// clasa main pentru printare

class StudentTest{
    public static void main(String [] args){
        Student s1 = new Student("Alina", 61,"alinapopeste@gmail.com");
        Student s2 = new Student("Marco", 44, "marcoantonio@gamil.com");

        System.out.println("s1.equals(s2)" + s1.equals(s2));
        System.out.println("Hashcode.s1" + s1.hashCode());
        System.out.println("Hashcode.s2" + s2.hashCode());
        System.out.println("Hash codes are equals?" + (s1.hashCode() == s2.hashCode()));
    }
}
