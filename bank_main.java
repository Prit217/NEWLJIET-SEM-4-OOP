
interface bank {
  
    void interest();
} 

class SBI implements bank {
    double amount;
    double interest_rate;
    SBI(double amount, double interest_rate) {
       this.amount = amount;
       this.interest_rate = interest_rate;
    }
    public void interest() {
        double interest_amount = (amount * interest_rate) / 100;
        System.out.println("SBI interest is " + interest_amount);
    }
}

class axis implements bank {
    double amount;
    double interest_rate;
    axis(double amount, double interest_rate) {
        this.amount = amount;
        this.interest_rate = interest_rate; 
    }
    public void interest() {
        double interest_amount = (amount * interest_rate) / 100;
        System.out.println("axis interest is " + interest_amount);
    }
}
public class bank_main {
    public static void main(String[] args) {
        SBI sbi = new SBI(10000, 5);
        axis axis_bank = new axis(10000, 6);
        sbi.interest();
        axis_bank.interest();
    }
}
