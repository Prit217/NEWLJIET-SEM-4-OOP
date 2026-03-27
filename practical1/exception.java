
import java.io.FileInputStream;

class exception
{
    public static void main(String args[])
    {
      try
      {
        FileInputStream f=new FileInputStream("D:\\java\\file.txt");
      }
       
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
}