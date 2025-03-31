package session_4_java_operators_and_statements.homework;

import java.util.Scanner;

public class Java2Homework {
    public static void main(String[] args ) {

        printForeachLoop () ;
        printJumpStatements () ;
        printContinueStatement () ;
        printContinue() ;



        int n = 10;
        int firstNumber = 0, secondNumber = 1;

        for (int i = 1; i <= 1; i++) {
            System.out.println("The fist ten nummbers are:" + n);

        }
    }

    public static void printForeachLoop() {
        int[] arrays = {1, 10, 20, 30, 40, 50};
        for (int num : arrays) {
            switch (num % 2) {
                case 0:
                    System.out.println(num + "Even");
                    break;
                case 1:
                    System.out.println("Odd");
                    break;
            }
        }
    }
    public static void printJumpStatements () {

        Scanner scanner = new Scanner(System.in);

        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Hello Word");


            case 2:
                System.out.println("Print the user's name");


            case 3:
                System.out.println("Exit");
                break;

        }
    }
    public static void printContinueStatement () {
        int numbers = 10;
        switch (numbers) {
            default:
                System.out.println("number 1.");
                break;
            case 0:
                System.out.println("number 2");
                break;
            case 1:
                System.out.println("number 3");
                break;
            case 2:
                System.out.println("number 4");
                break;
            case 3:
                System.out.println("number 5");
                break;
            case 4:
                System.out.println("number 6");
                break;
            case 5:
                System.out.println(" number 7");
                break;
            case 6:
                System.out.println("number 8");
                break;
            case 7:
                System.out.println("number 9");
                break;
            case 8:
                System.out.println("number 10");
                break;
        }
    }

    public static void printContinue() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please insert 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number" + i + sum);
            int num = scanner.nextInt();


             if(num %2 == 0) {
                 continue;

             }
        }


    }

 }
