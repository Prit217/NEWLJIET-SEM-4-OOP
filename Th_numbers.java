class Th_numbers extends Thread 
{
    public void run()
    {
       
            for (int i = 1; i <= 10; i++) {
                System.out.println(+ i);
            }
        
    }
    public static void main(String[] args) {
        Th_numbers t1 = new Th_numbers();
        t1.start();
    }
}
