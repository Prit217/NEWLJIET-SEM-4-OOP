// KEEP THE FILE NAME SAME AS THE CLASS WHICH CONSISTS OF MAIN 

abstract class abstract_cm {

    abstract void start();

    void stop() {
        System.out.println("Stopped");
    }
}

class car extends abstract_cm {

    public void start() {
        System.out.println("Start with key");
    }
}

class scooter extends abstract_cm {

    public void start() {
        System.out.println("Starts with kick");
    }

    public static void main(String[] args) {
        abstract_cm c = new car();
        c.start();
        c.stop();

        abstract_cm c1 = new scooter();
        c1.start();
        c1.stop();
    }
}
