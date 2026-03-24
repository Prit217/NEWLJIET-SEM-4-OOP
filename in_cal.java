interface calculator
{
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
class in_cal implements calculator
{
    public void add(int a,int b)
    {
        System.out.println("addition is "+(a+b));
    }
    public void sub(int a,int b)
    {
        System.out.println("subtraction is "+(a-b));
    }
    public void mul(int a,int b)
    {
        System.out.println("multiplication is "+(a*b));
    }
    public void div(int a,int b)
    {
        if(b!=0)
        {
            System.out.println("division is "+(a/b));
        }
        else
        {
            System.out.println("division by zero is not allowed");
        }
        
    }

    public static void main(String[] args) {
        in_cal obj=new in_cal();
        obj.add(10, 5);
        obj.sub(10, 5);
        obj.mul(10, 5);
        obj.div(10, 5);
        obj.div(10, 0);
    }
}