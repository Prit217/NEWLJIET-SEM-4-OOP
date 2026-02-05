import java.util.*;
class cal
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a");
    int a=sc.nextInt();

    System.out.println("enter b");
    int b=sc.nextInt();

    System.out.println(" press + for addition");
    System.out.println(" press - for subtrection");
    System.out.println(" press * for multiplication");
    System.out.println(" press / for division");
    

    System.out.println("enter choice");
    char choice=sc.next().charAt(0);
    
    switch (choice) 
    {
        case '+':
            System.out.println("addition is "+(a+b));
            break;
         case '-':
            System.out.println("subtrection is "+(a-b));
            break;
          case '*':
            System.out.println("multiplication is "+(a*b));
            break;
             case '/':
            System.out.println("division is "+(a/b));
            break;
        default:
          System.out.println("invalid choice");
    }
  
  }
}