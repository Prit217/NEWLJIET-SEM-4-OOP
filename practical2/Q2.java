
abstract class shape {

    abstract void area();
}

class circle extends shape {

    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is " + area);
    }

}

class rectangle extends shape {

    double length;
    double breadth;

    rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double area = length * breadth;
        System.out.println("Area of rectangle is " + area);
    }

}

class triangle extends shape {

    double base;
    double height;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is " + area);
    }

}


public class Q2 {

    public static void main(String[] args) {
        shape s = new circle(5);
        s.area();
        shape s1 = new rectangle(4, 6);
        s1.area();
        shape s2 = new triangle(4, 6);
        s2.area();
    }
}
