package Session16_Hash._Homeweork;


// Implement the equals() and hashCode() methods for a Rectangle class with width and height fields. Test that two instances with the same width and height return true for equals() and have the same hash code.
public class Rectangle {
    private int width;
    private int height;
    // Constructor

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // suprascrierea metodei equals

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // suprascrierea metodei hashCode

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
// metoda main pentru printare

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);

        System.out.println("r1.equals(r2)? " + r1.equals(r2));
        System.out.println("HashCode r1: " + r1.hashCode());
        System.out.println("HashCode r2: " + r2.hashCode());
        System.out.println("Hash codes are equal? " + (r1.hashCode() == r2.hashCode()));
    }
}

