import java.util.Scanner;
class Th_reverse extends Thread
{
  public void run()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a NUMBER: ");
    int num = sc.nextInt();
    int rev = 0;
    while(num!=0)
    {
        int rem = num%10;
        rev = rev*10 + rem;
        num = num/10;
    }
    System.out.println("Reverse of the number is: "+rev);
  }
  public static void main(String[] args) {
    Th_reverse t1 = new Th_reverse();
    t1.start();
  }
}
