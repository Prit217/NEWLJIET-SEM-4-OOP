import java.util.Scanner;

public class  Q3_DistrictArray {
    public static void main(String[] args) {
        String[] districts = {"Ahmedabad", "Surat", "Vadodara", "Rajkot", "Bhavnagar"};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index (0-4): ");
        
        int index = sc.nextInt();
        
        if (index >= 0 && index < districts.length) {
            System.out.println("District: " + districts[index]);
        } else {
            System.out.println("Out of Bounds");
        }
        
        sc.close();
    }
}
