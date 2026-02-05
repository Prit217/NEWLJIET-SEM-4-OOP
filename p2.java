import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the scanner for us
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("=== Java Student Database ===");
            
            // 1. Reading a String (Full Line)
            System.out.print("Enter full name: ");
            String name = sc.nextLine();
            
            // 2. Reading an Integer
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            
            // 3. Reading a Double
            System.out.print("Enter current GPA: ");
            double gpa = sc.nextDouble();
            
            // 4. Reading a single word/token
            System.out.print("Enter Department (one word): ");
            String dept = sc.next();
            
            // Displaying the results
            System.out.println("\n--- Data Saved ---");
            System.out.println("Student: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("GPA: " + gpa);
            System.out.println("Department: " + dept);
            
            // Simple logic check
            if (gpa >= 3.5) {
                System.out.println("Status: Honor Roll Student");
            } else {
                System.out.println("Status: Regular");
            }
        } 
        // No sc.close() needed here because of 'try-with-resources'
    }
}