import java.util.*;
class palli
{
  public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);

    int reverse=0;
    System.out.println("enter a");
    int a=sc.nextInt();
    int b=a;
    
    while(a>0)
    {
      int digit = a%10;
      reverse= reverse*10+digit;
      a=a/10;
    }
    System.out.println(reverse);

    if(reverse==b)
    {
      System.out.println("number is pallindrom");
    }

  }
}