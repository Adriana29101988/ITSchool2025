package session_10_OOP;

public class ContBancar {

    private String titular;
    private int sold;

    private static double dobanda = 0.08;

    public ContBancar(String titular, int soldInitial) {
        this.titular = titular;
        this.sold = soldInitial;
    }

    public void depunere(int suma) {
        if (suma > 0) {
            sold += suma;
        } else {
            System.out.println("nu puteti depune o suma negativa");
        }
    }

    public void retragere(int suma) {
        if (suma > 0 && suma <= sold) {
            sold = sold - suma;
        } else {
            System.out.println("valoare invalida suma");
        }
    }

    public static void setDobanda(double dobandaNoua) {
        if (dobandaNoua >= 0) {
            dobanda = dobandaNoua;
        } else {
            System.out.println("eroare la setarea dobanzii");
        }
    }


    public void getDetails() {
        System.out.println("Titular: " + titular);
        System.out.println("Sold: " + sold);
        System.out.println("doabnda: " + dobanda);

    }

}
