package session_18_Streams.Homework;


import Session_16_Hash.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercitii {
    public static void main(String[] args) {
        System.out.println("Exercitiul nr.1");
        evenNumbersFilter();
        System.out.println("Exercitiul nr.2");
        longestString();
        System.out.println("Exercitiul nr.3");
        primeNumbersBasic();
        System.out.println("Exercitiul nr.4");
        concatenationString();
        System.out.println("Exercitiul nr.5");
        System.out.println("People older than 18:");
        System.out.println("Exercitiul nr.6");
        sumIntegers();
        System.out.println("Exercitiul nr.7");
        transformNumbers();
        System.out.println("Exercitiul nr.8");
        countVowels();
        System.out.println("Exercitiul nr.9");
        findTheMostFrequentlyWord();
        System.out.println("Exercitiul nr.10");
        totalNumberOfCharacters();
        System.out.println("Exercitiul nr.12");
        getTotalSalary();
        System.out.println("Exercitiul nr.14");
        highestAveragePrice();
        System.out.println("Exercitiul nr.13");
        covertIntegers();

    }

    public static void evenNumbersFilter() {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Numerele pare sunt: " + evenNumbers);
    }

    //Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)
    public static void longestString() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String longest = strings.stream()
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println("Cel mai lung String este: " + longest);
    }

    //Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.

    public static void primeNumbersBasic() {

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        System.out.println("Numerele prime sunt: " + primeNumbers);
    }

    // Verifică dacă un număr este prim
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    //Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)
    public static void concatenationString() {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        String result = strings.stream()
                .collect(Collectors.joining());
        System.out.println(result + "\n");
    }

    // Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
    //class Person {
    //    String firstName;
    //    String lastName;
    //    int age;
    //}
    //List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

    public class Person {
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public class PersonFilter {

        // Metodă care filtrează persoanele care au vârsta mai mare de 18
        public static List<Person> getAdults(List<Person> people) {
            return people.stream()
                    .filter(p -> p.age > 18)
                    .collect(Collectors.toList());

        }

        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17),
                new Person("Charlie", "Brown", 22)
        );
        List<Person> adults = PersonFilter.getAdults(people);

    }
    // Create a stream of integers from an array and find the sum of all integers using the reduce method. (Input: Integer[] numbers = {1, 2, 3, 4, 5};)

    public static void sumIntegers() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).reduce(0, (Integer::sum));
        System.out.println("Sum of all numbers:" + sum);

    }
    // Use streams to transform a list of strings into a list of their respective lengths. (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)

    private static void transformNumbers() {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        long numbers = strings.stream()
                .filter(s -> s.length() == 10)
                .count();
        System.out.println(numbers);
    }
    //Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)

    private static void countVowels() {
        String sentence = "Hello World";
        long vowels = sentence.toLowerCase()
                .chars()
                .filter(a -> "aeiou".indexOf(a) >= 0)
                .count();
        System.out.println("Numbers of vowels:" + vowels);
    }

    //iven a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)
    private static void findTheMostFrequentlyWord() {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        String mostFrequently = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split( "")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(h -> h, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("fara cuvinte");
        System.out.println("cel mai frecvent cuvant:" + mostFrequently);
    }
// Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)
     private static void totalNumberOfCharacters(){
         List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
         long numbersCharacters  = strings.stream()
                 .flatMapToInt(str -> str.chars())   // transformăm fiecare string în stream de caractere
                 .filter(c -> !Character.isWhitespace(c))     // excludem caracterele de tip spațiu
                 .count();     // numărăm toate caracterele rămase

         System.out.println("numberCharacter: " +numbersCharacters);
     }
//Given a list of employee objects with attributes: name, department, and salary; find the department with the highest total salary.

    private static void getTotalSalary(){
        List<Employee> employees = List.of(
                new Employee("Anna", "HR", 2300),
                new Employee("Maria", "Marketing", 2800),
                new Employee("Crina", "IT", 3900),
                new Employee("Tim", "Finance", 3100)
        );
        //grupam dep
        Map<String,Double> salaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        // il gasim
        String bestDepartment = salaryByDepartment.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nici un Dep");
        System.out.println("Departamentul cu cel mai mare salariu:"+ bestDepartment);
    }
     static class Employee{
         private final String name;
         private final String department;
         private final int salary;


         Employee(String name, String department, int salary) {
             this.name = name;
             this.department = department;
             this.salary = salary;
         }

         public String getName() {
             return name;
         }

         public String getDepartment() {
             return department;
         }

         public int getSalary() {
             return salary;
         }
     }

     //Given a list of products with attributes: name, category, and price; find the category with the highest average price.
     static class Products{
        private final String name;
        private final String category;
        private final int  price;

         public Products(String name, String category, int price) {
             this.name = name;
             this.category = category;
             this.price = price;
         }

         public String getName() {
             return name;
         }

         public String getCategory() {
             return category;
         }

         public int getPrice() {
             return price;
         }
     }
     private static void highestAveragePrice(){
        List<Products> products= List.of(
                new Products( "Karotte","Gemuse" , 12),
                new Products("Apfel", "Obst", 4),
                new Products("Paprika", "Gemuse", 3),
                new Products("Waschmittel","Washprodukte" , 41)
        );
        // gruparea categoriilor si adunam preturile
         Map<String, Double> highest = products.stream()
                 .collect(Collectors.groupingBy(
                         Products::getCategory,
                         Collectors.averagingDouble(Products::getPrice)
                 ));


         // gasim categoria cu cel mai mare pret
         String mostExpensiveCategory = highest.entrySet().stream()
                 .max(Map.Entry.comparingByValue())
                 .map(Map.Entry::getKey)
                 .orElse("Nici o categorie");
         System.out.println("categoria cu cel mai mare pret:" + mostExpensiveCategory);
     }

     // Using a stream of strings representing numbers (e.g., "1", "2", "3"), convert them to integers and find the product of all numbers using reduce. (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)

    private static void covertIntegers(){
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        int product = numbers.stream()
                .map(Integer::parseInt) // il convertesc
                .reduce(1, (a, b) -> a*b);
        System.out.println("produsul numerelor este :" + product);

        }

    }
  // Given a list of books with attributes: title, author, and year of publication; use streams to find all the books published before the year 2000 and group them by author in a map where the key is the author and the value is a list of titles of their books.

    class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }
    }

// Create a stream from a text file and use stream operations to find and print the longest word in the file.
// Citeste un fisier text si gaseste cel mai lung cuvant folosind Java Streams



