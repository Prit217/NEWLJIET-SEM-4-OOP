
abstract class s {

    abstract double area();
}

class Triangle extends s {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends s {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends s {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class main {

    public static void main(String[] args) {
        s tri = new Triangle(10, 5);
        s rect = new Rectangle(10, 5);
        s circ = new Circle(7);

        System.out.println("Triangle Area: " + tri.area());
        System.out.println("Rectangle Area: " + rect.area());
        System.out.printf("Circle Area: " + circ.area());
    }
}
