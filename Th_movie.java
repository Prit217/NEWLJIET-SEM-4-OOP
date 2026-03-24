class Th_movie extends Thread {

    public void run() {
        
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " is booking ticket " + i);
            }
        }
    }

    public static void main(String[] args) {
        Th_movie t1 = new Th_movie();
        t1.setName("person1");
        t1.start();
        Th_movie t2 = new Th_movie();
        t2.setName("person2");
        t2.start();
    }
}
