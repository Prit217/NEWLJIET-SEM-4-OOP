class A 
{
  int addition(int a,int b)
  {
    return a+b;
  }
  int addition(int a,int b,int c)
  {
    return a+b+c;
  }
  public static void main(String[] args)
  {
    A aa=new A();
    System.out.println(aa.addition(2,3));
    System.out.println(aa.addition(2,3,6));
  }
}