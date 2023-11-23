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
    ShapeArea(float r) {
        area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }

    // Constructor for triangle
    ShapeArea(double base, double height, char c, char d) {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }


public class Main {
    public static void main(String[] args) {
        ShapeArea s=new ShapeArea(4.2);
        ShapeArea s= new ShapeArea(4, 5);
        ShapeArea s= new ShapeArea(3, 'c');
        ShapeArea s= new ShapeArea(4.9, 5, 't', 't');
    }
}
}
