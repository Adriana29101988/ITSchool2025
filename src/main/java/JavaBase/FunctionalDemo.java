package JavaBase;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalDemo {

    public static void main(String[] args) {
        //(parametri) -> expresie
        //(p1, p2) -> { bloc de executie }
        List<String> l = List.of("Marcel", "Vio");
        l.forEach(n -> System.out.println(n));
        l.forEach(System.out::println);


        List<Integer> numbers = List.of(1,2,3,6,4,7,2,3,4);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}
