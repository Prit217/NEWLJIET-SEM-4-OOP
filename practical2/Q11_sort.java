import java.util.*;

class Q11_sort
{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> number = new ArrayList<>();

      System.out.println("Enter integers:");
      int count = sc.nextInt();

      System.out.println("Enter " + count + " integers:");
      for (int i = 0; i < count; i++) {
          number.add(sc.nextInt());
      }

      Collections.sort(number, Collections.reverseOrder());

      System.out.println("Sorted integers in descending order:");
      for (int num : number) {
          System.out.print(num + " ");
      }

  }
}