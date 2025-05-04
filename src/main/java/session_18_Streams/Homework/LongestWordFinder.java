package session_18_Streams.Homework;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFinder {
    public static void main(String[] args) {
        try {
            String word = Files.lines(Paths.get("text.txt"))
                    .flatMap(linie -> Arrays.stream(linie.split("\\W+")))
                    .filter(s -> !s.isEmpty())
                    .max(Comparator.comparingInt(String::length))
                    .orElse("Nici un cuvant gasit");

            System.out.println("cel mai lung cuvant gasit:" + word);
        } catch (Exception e) {
            System.err.println("Eroare la citirea fișierului: " + e.getMessage());
        }

    }
}
