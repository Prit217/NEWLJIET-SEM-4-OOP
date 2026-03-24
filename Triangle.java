
abstract class shape {

    abstract void draw();
}

class circle extends shape {

    void draw() {
        System.out.println("Circle");
    }
}

class rectangle extends shape {

    void draw() {
        System.out.println("Rectangle");
    }
}

class Triangle extends shape {

    void draw() {
        System.out.println("Triangle");
    }

    public static void main(String[] args) {
        shape c = new circle();
        c.draw();

        shape c1 = new rectangle();
        c1.draw();

        shape c2 = new Triangle();
        c2.draw();
    }
}
