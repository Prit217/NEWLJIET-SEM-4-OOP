class Th_lifecycle extends Thread 
{
    public void run()
    {
      try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
    }
  }
    public static void main(String[] args) {
        Th_lifecycle t1 = new Th_lifecycle();
        System.out.println("Thread state before creation: " + t1.getState());
        t1.start();
        System.out.println("Thread state after starting: " + t1.getState());
        
      }
    }
  