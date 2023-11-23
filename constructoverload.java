package constructoverload;


class ShapeArea {
    double area;

    // Constructor for square
    ShapeArea(double side) {
        area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Constructor for rectangle
    ShapeArea(double length, double breadth) {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Constructor for circle
    ShapeArea(double radius, char c) {
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Constructor for triangle
    ShapeArea(double base, double height, char c, char d) {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }


public class Main {
    public static void main(String[] args) {
        ShapeArea square = new ShapeArea(4);
        ShapeArea rectangle = new ShapeArea(4, 5);
        ShapeArea circle = new ShapeArea(3, 'c');
        ShapeArea triangle = new ShapeArea(4, 5, 't', 't');
    }
}
}