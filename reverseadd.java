import java.util.*;
class reverseadd
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter a");
    int a=sc.nextInt();
    do
    {
    int l=a%10;
    int m=(a/10)%10;
    int f=a/100;
    int r=(l+m+f);
    System.out.println(r);
    break;
    }while(a>0);
   
  } 
}