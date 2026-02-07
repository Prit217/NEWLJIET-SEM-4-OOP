
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
  public static void main(String[]args)
  {
    child c=new child();
    c.show();
    c.show1();

  }
}