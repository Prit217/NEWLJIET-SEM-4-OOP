class error extends Thread
{
  public void run()
  {
    try {
        int a=10/0;
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
  }
}
class suggestion extends Thread
{
  public void run()
  {
    System.out.println("Suggestion: Avoid dividing by zero.");
  }
}
class save_document extends Thread
{
  public void run()
  {
    System.out.println("Document saved successfully.");
  }
}
class buzzer extends Thread
{
  public void run()
  {
    System.out.println("Buzzer sound: fahhhh!");
  }
}
public class VS_code {
    public static void main(String[] args) {
        error t1 = new error();
        suggestion t2 = new suggestion();
        save_document t3 = new save_document();
        buzzer t4 = new buzzer();
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}