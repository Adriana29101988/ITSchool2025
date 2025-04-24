package session17_Lambda;

import java.util.function.Consumer;

public class IntSumPractice {
    public static void main (String [] args) {
        IntSum result = (int a,int b ) -> a + b;
        System.out.println(result.sum(1,2));
    }
}

class IntmultiplyPractice{
    public static void main (String [] args){
        IntMultiply result = (int a, int b)-> a*b;
        System.out.println(result.multy(2,3));
    }
}

class CalculatorPractice {
    public static void main(String[] args) {
        Calculator sum = (int a, int b) -> a + b;
        Calculator multy = (int a, int b) -> a * b;
        Calculator subs  = (int a, int b )-> a / b;
        System.out.println("sum " + sum.compute(2,3));
        System.out.println("multy" + multy.compute(2,3));
        System.out.println("subs" + subs.compute(4,3));
    }
}

class LambdaExemples {
    public static void main(String[] args) {
    Runnable noParam = () -> System.out.println("from Runnable");
       noParam.run();
        Consumer<String> oneParam =msg -> System.out.println("message " + msg);
        oneParam.accept("from Consumer");
    }
}