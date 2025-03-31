package session_10_OOP;

import java.util.ArrayList;

public class ShopingCart {

    private ArrayList<Product> products;
    private int id;

    private static int cartCounter = 0;

    public ShopingCart() {
        this.products = new ArrayList<>();
        cartCounter++;
        this.id = cartCounter;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addDiscunt() {
        for (Product p : products) {
            p.setPrice(p.getPrice() * 0.9);
        }
    }

    public void displayCart() {
        System.out.println("cart id: " + id);
        for (Product p : products) {
            System.out.println(p);
        }
//        products.forEach(System.out::println);
    }
}

class Product {

    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + price + "$";
    }
}

class MainShopping {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenovo", 1200.0);
        Product product2 = new Product(2, "Mac", 2000);
        Product product3 = new Product(3, "Iphone", 1600);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

        ShopingCart cart1 = new ShopingCart();
        cart1.addProduct(product1);
        cart1.addProduct(product3);

        ShopingCart cart2 = new ShopingCart();
        cart2.addProduct(product2);

        System.out.println("cart1:");
        cart1.displayCart();
        System.out.println("cart2:");
        cart2.displayCart();

        System.out.println("cart3:");
        ShopingCart cart3 = new ShopingCart();
        cart3.addProduct(product1);
        cart3.addProduct(product2);
        cart3.addProduct(product3);
        cart3.addDiscunt();
        cart3.displayCart();
    }
}