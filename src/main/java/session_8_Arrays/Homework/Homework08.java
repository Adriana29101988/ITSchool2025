package session_8_Arrays.Homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Homework08 {
    private static Object shoppingList;

    public static void main(String[] args) {

        shoppingList();
        christmasList();
        emptyArrayList ();
        tenIntegers();
        citiesArrayList();
    }
    /*
       Create a shopping list with Array and print the values
   */
    public static void shoppingList() {
        String [] shoppingList = {"Jam","Sugar","Honey","Rice","Cereal"};
        for (String item : shoppingList){
            System.out.println(item);
        }
    }
    /*
        Create a christmas list with ArrayList and print the values
    */
    public static void christmasList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Shoes");
        arrayList.add("Iphone13");
        arrayList.add("Pair of pearl Earing");
        arrayList.add("Lipgloss");
        System.out.println(arrayList);
    }
    /*
     Create 2 empty ArrayLists: studentList and graduateStudentList
 populate studentList with 10 students
 copy values from studentList to graduateStudentList
 iterate through graduateStudentList and print each graduated student

     */
    public static void emptyArrayList (){
        List <String> studentList = new ArrayList<>(List.of("Manuel", "Greg","Mark","John","Chris","Noel","Tim","Melanie","Fred","Daniel"));
        List<String> graduateStudentList = new ArrayList<>(studentList);
        for (String student : graduateStudentList) {
            System.out.println(student);
        }

    }
    /*
   Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
   */
    public static void tenIntegers() {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("numere pare:" +evenCount);
        System.out.println("numere impare:" +oddCount);
    }
    /*
    Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
     */
    public static void citiesArrayList(){
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Riga");
        citiesList.add("Sienna");
        citiesList.add("Florenza");
        citiesList.add("Amsterdam");
        citiesList.add("Milano");
        System.out.println(citiesList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("adauga un oras in lista mea: ");
        String newcity = scanner.nextLine();
        if (citiesList.contains(newcity)) {
            System.out.println("numele orasului este deja in lista mea");
        }else {
            citiesList.add(newcity);
            System.out.println("numele orasului a fost adaugat in lista" + newcity);
        }
        scanner.close();
    }
    /*
    Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.
     */
    public static void studentNameLinkedList(){
        List<String> studentList= new LinkedList<>(List.of("Emanuel", "Maria", "Ben", "Katy"));
        System.out.println("numele studentilor" + studentList) ;
    }
}
