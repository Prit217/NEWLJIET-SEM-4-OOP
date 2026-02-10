import java.util.*;
class Q1
{
  
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a number");
      int a=s.nextInt();
      int b=a;

      int l=a%10;
      int m=(a/10)%10;
      int f=a/100;

      int r=((l*100)+(m*10)+f);

      if (r==b) {
      System.out.println(a+" is pallindrom number");    
      } else {
        System.out.println(a+" is not pallindrom number"); 
      }
  }
}