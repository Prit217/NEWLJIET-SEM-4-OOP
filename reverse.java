//import java.util.*;
//class reverse 
//{
  //public static void main(String[] args) {
      
    //Scanner sc=new Scanner(System.in);

  
    //System.out.println("enter a");
    //int a=sc.nextInt();

    //int l=a%10;
    //int m=(a/10)%10;
    //int f=a/100;
    //int r=((l*100)+(m*10)+f);
    //System.out.println("reverse number is "+r);

  //}
//}

import java.util.*;
class reverse 
{
  public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);

    int reverse=0;
    System.out.println("enter a");
    int a=sc.nextInt();
    
    while(a>0)
    {
      int digit = a%10;
      reverse= reverse*10+digit;
      a=a/10;
    }
    System.out.println(reverse);

  }
}