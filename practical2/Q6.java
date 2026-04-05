interface P
{
  int A=10;
  void display();
}

interface P1 extends P
{
  int B=20;
  void display1();
}

interface P2 extends P
{
  int C=30;
  void display2();
}

interface P12 extends P1,P2
{
  int D=40;
  void display3();
}

class Q6 implements P12
{
  public void display()
  {
    System.out.println("A="+A);
  }
  public void display1()
  {
    System.out.println("B="+B);
  }
  public void display2()
  {
    System.out.println("C="+C);
  }
  public void display3()
  {
    System.out.println("D="+D);
  }
  
  public static void main(String[] args) {
      Q6 a=new Q6();
      a.display();
      a.display1();
      a.display2();
      a.display3();
      
  }
}
