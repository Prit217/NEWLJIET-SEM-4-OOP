class Q9 {
    int acc_no=0;
    String name="";
    double balance=0.0;
    
    void setdata(int acc_no, String name, double balance)
    {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    void display()
    {
        System.out.println("ACCOUNT NUMBER = "+acc_no);
        System.out.println("NAME = "+name);
        System.out.println("BALANCE = "+balance);
    }
    void deposit(int amount)
    {
        balance = balance + amount;
    }
    public static void main(String[] args) {
        Q9 ob = new Q9();
        ob.setdata(123, "Prince" , 10000.00);
        ob.display();
        ob.deposit(20000);
        ob.display();
    }
}