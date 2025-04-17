package Session16_Hash._Homeweork;

import java.util.Objects;

public class Product {
    // Create a Product class with name, price, and id fields

    private String name;
    private double price;
    private String idFields;

    // creaza Constructorul

    public Product(String name, double price, String idFields) {
        this.name = name;
        this.price = price;
        this.idFields = idFields;
    }
    //Implement the equals() method to check only the id field.


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(idFields, product.idFields);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFields);
    }

//   // Setter pentru id (ca să-l putem modifica în test) - aici sincer nu am inteles de ce ar trebui setter ?????
     public void setIdFields(String idFields) {
        this.idFields = idFields;
    }
}
// clasa main pentru printare

class ProductTest{
    public static void main(String [] args){

        Product p1 = new Product("laptop", 11.22, "K1");
        Product p2 = new Product("handy", 36.22, "K1");

        //  Test that two instances with the same id return true for equals() and have the same hash code
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());

        //Then change the id of one instance and test that they are no longer equal and have different hash codes.
        p2.setIdFields("K4");

        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());
    }
}
