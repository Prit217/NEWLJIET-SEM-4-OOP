class order extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName() + " is placing an order.");
  }
}
class booking extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName() + " is making a booking.");
  }
}
class delivery extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName() + " is delivering the order.");
  }
}
class Th_restaurant
{
  public static void main(String[] args)
  {
    order o1 = new order();
    booking b1 = new booking();
    delivery d1 = new delivery();
    
    o1.setName("Customer");
    b1.setName("Receptionist");
    d1.setName("Delivery Person");
    
    o1.start();
    b1.start();
    d1.start();
  }
}