
class Ticket extends Thread {

    public void run() {
        
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is booking ticket " + i);
            }
        }
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.start();
        Ticket t2 = new Ticket();
        t2.start();
        t1.setName("user1");
        t2.setName("user2");
    }
}
