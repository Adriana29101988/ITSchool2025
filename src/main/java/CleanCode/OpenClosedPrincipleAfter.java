package CleanCode;

public class OpenClosedPrincipleAfter {

    public static void main(String[] args) {
        Shape circle = new Circle(12.6);
        System.out.println( circle.calculateArea());

        Shape rectangle = new Rectangle(23.5, 12.6);
        System.out.println(rectangle.calculateArea());
    }
}


interface Shape{
    double calculateArea();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape{
    double lenght, width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return lenght *  width;
    }
}

class SquareA implements Shape{
    double size;

    public SquareA(double size) {
        this.size = size;
    }

    @Override
    public double calculateArea() {
        return size * size;
    }
}