class ATM_withdrowal extends Thread
{
  public void run()
  {
    System.out.println(Thread.currentThread().getName()+" is running");
  }
  public static void main(String[] args)
  {
    ATM_withdrowal t1=new ATM_withdrowal();
    t1.start(); 
    ATM_withdrowal t2=new ATM_withdrowal();
    t2.start();
    t1.setName("user1");
    t2.setName("user2");
  }
}