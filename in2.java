class parent 
{
  public void show()
  {
    System.out.println("this is parent class");
  
  }
}
class child extends parent
{
  public void show1()
  {
    System.out.println("this is child class");
  }
}
class child2 extends parent
{
  public void show2()
  {
    System.out.println("this is child2 class");
  }

  public static void main(String[] args)
  {
    child c1=new child();
    c1.show();
    c1.show1();
    child2 c2=new child2();
    c2.show();
    c2.show2();
  }
}
