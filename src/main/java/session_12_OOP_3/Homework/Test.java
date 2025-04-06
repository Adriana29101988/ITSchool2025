package session_12_OOP_3.Homework;

// clasa abstracta Parent
abstract class Parent {
    // printeaza message
    public abstract void message();
}
// prima subclasa care  extinde Parent
class FirstSubClass extends Parent{

    @Override
    public void message() {
        System.out.println("Aceasta este prima clasa ");

    }
}
// a doua subclasa care extine Parent
class SecondSubClass extends Parent{

    @Override
    public void message() {
        System.out.println("Aceasta este a doua clasa ");

    }
}
// Call the methods 'message' by creating an object for each subclass.Creaza un obiect pentru fiecare subclasa
 public class Test{
    public static void main(String [] args){
        Parent first = new FirstSubClass();
        Parent second = new SecondSubClass();
        first.message();
        second.message();
    }
}