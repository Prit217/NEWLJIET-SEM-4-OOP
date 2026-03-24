
class A extends Thread {

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("hii");
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("hello");
        }
    }
}

public class mul_thread {

    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
}
