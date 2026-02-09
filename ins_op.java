class A
{
  public static void main(String[] args)
  {
    A a=new A();
    if(a instanceof A)
      System.out.println("a is instance of class");
    else
      System.out.println("a is no instance of class");
  }
}