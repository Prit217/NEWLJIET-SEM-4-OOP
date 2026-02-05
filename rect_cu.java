import java.util.*;
class rect_cu
{
  int l,b;
  rect_cu()
  {
     Scanner sc=new Scanner(System.in);

    
    System.out.println("enter a");
    l=sc.nextInt();
    System.out.println("enter b");
    b=sc.nextInt();
    
  }
  public void area()
  {
    int area=l*b;
    System.out.println(area);
  }
  public static void main(String[] args) {
      rect_cu r=new rect_cu();
      r.area();
  }
}