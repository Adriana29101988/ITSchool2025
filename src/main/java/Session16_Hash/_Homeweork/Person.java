package Session16_Hash._Homeweork;

//Create a Person class with name, age, and email fields. Implement the equals() method to check only the name and age fields. Implement the hashCode() method to use the name and age fields to calculate the hash code. Test that two instances with the same name and age return true for equals() and have the same hash code.
public class Person {
  private String name;
  private int age;
  private String email;
   // Constructorul
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    // suprascrierea metodei equals si hashCode


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

// clasa main pentru printare
class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Adriana", 36, "adrianamm88@gmail.com");
        Person p2 = new Person("Emilia", 44, "emiliapopescu@gmail.com");

        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());
        System.out.println("Hash codes are equal? " + (p1.hashCode() == p2.hashCode()));
    }
}
