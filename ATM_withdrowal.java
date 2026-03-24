class ATM_withdrowal extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName()+" is running");
  }
  public static void main(String[] args)
  {
    ATM t1=new ATM();
    t1.start(); 
    ATM t2=new ATM();
    t2.start();
    t1.setName("user1");
    t2.setName("user2");
  }
}