import java.util.*;
class WRWA
{
  Scanner sc=new Scanner(System.in);
  int addition(int a,int b)
  {
    System.out.println("with return,with argument");
    return(a+b);
  }
  public static void main(String[] args) {
      WRWA ob=new WRWA();
      System.out.println(ob.addition(10,20));
  }
}