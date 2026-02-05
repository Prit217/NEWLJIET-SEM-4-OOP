package p1;
public class as
{
  private void show1()
  {
    System.out.println("this is private method");
  }
  protected void protected1()
  {
    System.out.println("this is protected method");
  }
  void default1()
  {
    System.out.println("this is default method");
  }
  public void public1()
  {
    System.out.println("this is public method");
  }
  public static void main(String[]args)
{
  as a=new as();
  a.show1();
  a.protected1();
  a.default1();
  a.public1();
}
}
