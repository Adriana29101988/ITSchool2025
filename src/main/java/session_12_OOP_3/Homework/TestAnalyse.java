package session_12_OOP_3.Homework;

// An abstract class has a constructor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
// creez o clasa abstracta si dupa un constructor
abstract class Analyse {
    public Analyse() {
        System.out.println("This is constructor of abstract class");
    }

    // si o metoda abstracta numita 'a_method'
    public abstract void a_method();

    // si o metoda non-abstracta care printeaza "This is a normal method of abstract class"
    public void normal_method() {
        System.out.println("This is a normal method of abstract class");
    }
}
//  A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
    // creez o subclasa care mosteneste clasa Analyse si are o metoda

    class SubClass extends Analyse {
        // o implementez cu override cu printeaza ceva

        @Override
        public void a_method() {
            System.out.println("This is abstract method");
        }
    }
    // creez o clasa main ca sa o pot printa

public class TestAnalyse {
     public static void main (String[]args ){
       // creem un oibiect din subclas
       SubClass object = new SubClass();
       // apelam metoda abstracta

         object.a_method();
         // apelam methoda non abstracta
         object.normal_method();
     }
}






