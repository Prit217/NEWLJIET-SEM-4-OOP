
import java.util.Scanner;

class Q8_bankaccount {

    double balance;

    Q8_bankaccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        try {
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal successful! New balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Q8_bankaccount account = new Q8_bankaccount(5000.00);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
