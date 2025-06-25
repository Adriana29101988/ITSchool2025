package CleanCode;

import org.w3c.dom.css.CSSImportRule;
public class OpenClosedPrincipleBefore {
}

class AreaCalculator{
    double calculateArea(Object shape){
        if(shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        if( shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.lenght* rectangle.width;
        }
        return 0;
    }
}

class CircleB {
    double radius;
}

class RectangleB{
    double lenght, width;
}