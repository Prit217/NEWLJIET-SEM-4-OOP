
class A
{
  int a=5,b=10,c;
  public void add()
  {
    c=a+b;
    System.out.println(c);
  }
}
class B extends A
{
  int d=2,e;
  public void add1()
  {
    e=c+d;
    System.out.println(e);
  }
  public static void main(String[]args)
  {
    B aa=new B();
    aa.add();
    aa.add1();

  }
}