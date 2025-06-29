package JavaBase;

public class Statement {

    public static void main(String[] args) {
        int x = 10;
        if (x > 0){
            System.out.println("x este pozitiv");
        } else if (x < 0) {
            System.out.println("x este negativ");
        }else {
            System.out.println("x este 0");
        }

        String day = "Friday";
        switch (day) {
            case "Monday":
                System.out.println("it's Monday");
                break;
            case "Friday":
                System.out.println("it's Friday");
                break;
            default:
                System.out.println("idk");
        }

        for( int i = 0; i<=10; i++){
            System.out.println(i);
        }

        int j=10;
        while (j>2){
            System.out.println("j = " + j);
            j--;
        }

        String[] array =  {"a", "b", "c"};
        for (String s : array){
            System.out.println(s);
        }
    }
}