package Session13_OOP_4;

public class Animal {

    public void makeSound(){
        System.out.println("Animal makes sounds");
    }

    public void sleep(){
        System.out.println("sleep");
    }
    public void scratch(){
        System.out.println("scratch");
    }


}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("dog barks");
    }
    @Override
    public void sleep() {
        System.out.println("dog sleeps");
    }
    public  void makeSoundAnimal (){
        super.makeSound();
    }
    public void fetch(){
        System.out.println("dog gets the ball");
    }
}

class Cat extends  Animal{
    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
class SuperMain{
    public static void main (String[] args ) {
        Dog dog = new Dog();
        dog.makeSound();;
        dog.makeSoundAnimal();
        dog.fetch();
    }

}
class AnimalMain{
    public static void main( String[] args ){
        Animal myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal.sleep();
    //    myAnimal.fetch();
        System.out.println( myAnimal.getClass().getSimpleName());

        try {
            Cat myCat = (Cat) myAnimal;
            myCat.makeSound();
        }catch (ClassCastException ex){
            System.out.println("Eroare la cast dintre un caine si o pisica: "+ ex);
        }

       Animal animal = new Cat();
        Cat cat = (Cat) animal;
        cat.makeSound();
        cat.sleep();
        cat.scratch();

        System.out.println(cat instanceof Cat );
        System.out.println(animal instanceof Cat);
        System.out.println(myAnimal instanceof Dog);
    }
}

