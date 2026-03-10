interface P
{
    public static final int a = 10;
    void a1();
}

interface P1 extends P
{
    public static final int b = 20;
    void a2();
}

interface P2 extends P
{
    public static final int c = 30;
    void a3();
}

interface P12 extends P1,P2
{
    public static final int d = 40;
    void a4();
}

class Q implements P12
{
    public void a1()
    {
        System.out.println("a1 is calling"+a);
    }
    public void a2()
    {
        System.out.println("a2 is calling"+b);
    }
    public void a3()
    {
        System.out.println("a3 is calling"+c);
    }
    public void a4()
    {
        System.out.println("a4 is calling"+d);
    }

    public static void main(String[] args) {
        Q obj=new Q();
        obj.a1();
        obj.a2();
        obj.a3();
        obj.a4();
    }
}