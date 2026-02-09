class parent 
{
  public void car()
  {
    System.out.println("white car");
  
  }
}
class child extends parent
{
  public void car()
  {
    super.car();
    System.out.println("red car");
  }
public static void main(String[] args)
  {
    child c=new child();
    c.car();
  }
}
