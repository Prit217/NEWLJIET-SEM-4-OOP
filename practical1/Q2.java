import java.util.*;
class Q2
{
  
  public static void main(String[] args) 
  {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a number");
      int a=s.nextInt();

      int l=a%10;
      int m=(a/10)%10;
      int f=a/100;

      int r=(l+m+f);
      System.out.println("sum of digit is "+r);
  }
}