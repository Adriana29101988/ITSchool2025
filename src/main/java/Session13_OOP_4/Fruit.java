package Session13_OOP_4;

public abstract class Fruit {

    public String taste(){
        return "fruit has taste";
    }
    public String color(){
        return "fruit has colour";
    }

    public abstract String colour();
}

class Apple extends Fruit {
    @Override
    public String taste() {
        return "Apple is sweet";
    }

    @Override
    public String colour() {
        return "Apple is red";
    }
}

class Orange extends Fruit{
    @Override
    public String taste (){
        return "Orange is orange";
    }
    @Override
    public String colour() {
        return "Orange is sour";
    }
}
class FruitTest{

    public static void main (String[] args ){
        printFruit(new Apple());
        printFruit(new Orange());

        Apple apple = new Apple();
        System.out.println(apple.taste());
        System.out.println(apple.colour());
    }
    public static void printFruit(Fruit fruit){
        System.out.println("Taste:" + fruit.taste());
    }
}
