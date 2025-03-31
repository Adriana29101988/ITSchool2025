package session_5_java_flow_control.homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class javaflow {
    public static void main(String[] args) {
        stringTodaysdate();
        stringDateDecomposition();

        stringSpecificDate ();
        stringCurrentTime ();
        displayCurrentTime();
        int weeksToAdd = 4;
        LocalDate resultDate = addWeeksToToday(weeksToAdd);
        System.out.println(resultDate);
        String dateString = "2025-03-15";
        String day = findDayofWeek(dateString);
        System.out.println("Ziua Saptamanii:" + dateString + day);

        daysBetween();

        Scanner scanner = new Scanner(System.in);
        String firstDate = scanner.nextLine();
        String secondDate = scanner.nextLine();
        long difference = daysBetween(firstDate, secondDate);
        System.out.println("numarul de zile :" + difference);
        scanner.close();
    }

    private static void daysBetween() {
    }

    public static void stringTodaysdate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today date:" + today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(formatter));
    }

    public static int stringDateDecomposition() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter dataDecomposition = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String year = date.format(DateTimeFormatter.ofPattern("yyyy"));
        String month = date.format(DateTimeFormatter.ofPattern("MM"));
        String day = date.format(DateTimeFormatter.ofPattern("dd"));

        System.out.println("Year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        return 0;

    }
    public static void stringSpecificDate (){
        LocalDate specificDate = LocalDate.now();
        System.out.println("actuala zi este:" + specificDate);
        boolean este10Decembrie2019 = isTodaySpecificDate();

        System.out.println(este10Decembrie2019 ? "true" : "false");
    }
    public static boolean isTodaySpecificDate() {
        LocalDate today = LocalDate.now();

        return today.equals(LocalDate.of(2019, 12, 10));
    }

    public static void stringCurrentTime () {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM:SS");
        System.out.println("ora curenta este: " + currentTime);

        displayCurrentTime();
    }
    private static void displayCurrentTime() {
    }
    public static  LocalDate addWeeksToToday (int weeks) {
        LocalDate today = LocalDate.now();
        LocalDate newDate = today.plusWeeks(weeks);
        return newDate;
    }
    public static String findDayofWeek(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateString,formatter);
        String dayOfWeek = date.getDayOfWeek().name();
        return dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase();

    }
    public static long daysBetween (String firstDate, String secondDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 =LocalDate.parse(firstDate + formatter);
        LocalDate date2 = LocalDate.parse(secondDate +formatter);
        return ChronoUnit.DAYS.between(date1,date2);
    }
}
