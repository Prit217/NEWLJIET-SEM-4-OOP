class si_Ticket extends Thread
{
    public void run()
    {
        if(Thread.currentThread().getName().equals("Thread-0"))
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+" is booking ticket "+i);
            }
        }
        else if(Thread.currentThread().getName().equals("Thread-1"))
        {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" is booking ticket "+i);
        }
    }
  }
    public static void main(String[] args)
    {
        si_Ticket t1=new si_Ticket();
        t1.start();
        si_Ticket t2=new si_Ticket();
        t2.start();
        
    }
}

