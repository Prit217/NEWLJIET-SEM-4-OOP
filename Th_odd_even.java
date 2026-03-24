class Th_odd extends Thread 
{
    public void run()
    {
       {
            for (int i = 1; i <= 10; i++) {
                if(i%2==0)
                System.out.println("Even number: " + i);
                
            }
        }
    }
}
class Th_even extends Thread 
{
    public void run()
    {
       {
            for (int i = 1; i <= 10; i++) {
                if(i%2!=0)
                System.out.println("Odd number: " + i);
                
            }
        }
    }
}
public class Th_odd_even {
    public static void main(String[] args) {
        Th_odd t1 = new Th_odd();
        t1.start();
        Th_even t2 = new Th_even();
        t2.start();
    }
}