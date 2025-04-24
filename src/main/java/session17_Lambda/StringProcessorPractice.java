package session17_Lambda;

public class StringProcessorPractice {
    public static void main(String[] args) {
        StringProcessor removeWhileSpaces = (String str) -> str.replace(" ", "");
        StringProcessor toUpperCase = (String str) -> str.toLowerCase();


        System.out.println(removeWhileSpaces.processor("Hello from lambda"));
        System.out.println(toUpperCase.processor("Hello "));

        StringProcessor combined = removeWhileSpaces.andThen(toUpperCase);
        System.out.println(combined.processor("Hello Lambda"));

    }
}
