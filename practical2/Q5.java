class Q5
{
  public static int power(int x,int y) throws IllegalArgumentException
  {
    if(y<0)
    {
      throw new IllegalArgumentException("Exponent cannot be negative");
    }
    int result=1;
    for(int i=1;i<=y;i++)
    {
      result=result*x;
    }
    return result;
  }

  public static void main(String[] args) {
      try
      {
        if (args.length < 2) {
            System.out.println("Please provide 2 integer as arguments");
            
        }
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int pow=power(x,y);
        System.out.println(x+"^"+y+"="+pow);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
  }
}