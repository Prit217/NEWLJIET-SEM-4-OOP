import java.util.Scanner;
class p1
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a");
    int a=sc.nextInt();
    
    switch (a) {
        case 1:
            System.out.println("monday");
            break;
         case 2:
            System.out.println("tuesday");
            break;
             case 3:
            System.out.println("");
            break;
             case 4:
            System.out.println("friday");
            break;
             case 5:
            System.out.println("setarday");
            break;
             case 6:
            System.out.println("sunday");
            break;
        default:
          System.out.println("invalid choice");
    }
  
  }
}