import java.util.*;
class WRNA
{
  Scanner sc=new Scanner(System.in);
  int display()
  {
    System.out.println("with return, no argument");
    int a=sc.nextInt();
    int b=sc.nextInt();
    return(a+b);
  }
  public static void main(String[] args) {
      WRNA ob=new WRNA();
      System.out.println(ob.display());
  }
}