
interface credit_card {

    void credit();
}

interface UPI {

    void UPI();
}

interface payment extends credit_card, UPI {

    void payment();
}

class payment_main implements payment {

    public void credit() {
        System.out.println("payment by credit card");
    }

    public void UPI() {
        System.out.println("payment by UPI");
    }

    public void payment() {
        System.out.println("payment is successful");
    }

    public static void main(String[] args) {
        payment_main obj = new payment_main();
        obj.credit();
        obj.UPI();
        obj.payment();
    }
}
