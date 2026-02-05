class method
{
  String brand;
  String colour;
  static int wheeler=4;
  void  display()
  {
    System.out.println("brand:"+brand);
    System.out.println("colour:"+colour);
  }
  static void display1()
  {
    System.out.println("wheeler:"+wheeler);
  }

  public static void main(String[]args)
  {
    method ob=new method();
    ob.brand="tata";
    ob.colour="white";
    ob.display();
    display1();   
  }
}
