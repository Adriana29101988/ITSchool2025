package JavaBase;

public class OOPDemo {
    public static void main(String[] args) {
        StandardUser sUser = new StandardUser("Marcel", 30, 2);
        PremiumUser pUser = new PremiumUser("Marcela", 32, 6);
        sUser.displayInfo();
        pUser.displayInfo();
        System.out.println(sUser.calculateDiscount());
        System.out.println(pUser.calculateDiscount());

        pUser.getNews();
        pUser.getNews("1234");
    }
}

abstract class User{
    protected String name;
    protected int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateDiscount();

    public void displayInfo(){
        System.out.println("Name: " + name + " age: " + age);
    }
}

class StandardUser extends User{
    private int numOfPurchaces;

    public StandardUser(String name, int age, int numOfPurchaces) {
        super(name, age);
        this.numOfPurchaces = numOfPurchaces;
    }

    @Override
    public double calculateDiscount() {
        return numOfPurchaces > 3 ? 0.1 : 0.0;
    }
}

class PremiumUser extends User {
    private int numOfPurchaces;

    public PremiumUser(String name, int age, int numOfPurchaces) {
        super(name, age);
        this.numOfPurchaces = numOfPurchaces;
    }

    @Override
    public double calculateDiscount() {
        return numOfPurchaces > 3 ? 0.2 : 0.1;
    }

    public void getNews(){
        System.out.println("new collection is added");
    }
    public void getNews(String code){
        System.out.println("new collection is added, you can view it with this code: " + code);
    }

}
