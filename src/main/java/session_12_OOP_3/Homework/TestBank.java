package session_12_OOP_3.Homework;
//create an abstract class 'Bank'
    abstract class Bank{

   // metoda abstracta getBalance
    public abstract void getBalance();
    }

// creez trei subclase A, B si C care extind clasa mama

class BankA extends Bank{
    @Override
    public void getBalance() {
        System.out.println("Soldul în Bank A este $100");
    }
}
class BankB extends Bank{
    @Override
    public void getBalance() {
        System.out.println("Soldul în Bank A este $150");
    }
}
class BankC extends Bank {
    @Override
    public void getBalance() {
        System.out.println("Soldul în Bank A este $200");
    }
}
//creez clasa main ca sa pot printa

public class TestBank{
        public static void main (String[] args){

            // creez obiecte pentru fiecare clasa

          Bank bankA = new BankA();
          Bank bankB = new BankB();
          Bank bankC = new BankC();
          // apelez metoda getBalance pentru fiecare obiect

            bankA.getBalance();
            bankB.getBalance();
            bankC.getBalance();

        }
}

