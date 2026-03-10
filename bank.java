interface bank
{
    void interest();
}
class SBI implements bank
{
    public void interest()
    {
        System.out.println("SBI interest is 5%");
    }
}
class axis implements bank
{
    public void interest()
    {
        System.out.println("axis interest is 6%");
    }
}
public class bank_main {
    public static void main(String[] args) {
        bank b1=new SBI();
        b1.interest();
        bank b2=new axis();
        b2.interest();
    }
}