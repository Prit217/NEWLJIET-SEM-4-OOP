
import java.io.FileInputStream;

class exception_1 {

    public static void main(String args[]) {
        
      int a=20;
      int b=0;
      int c=a/b;
      try {
           System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
