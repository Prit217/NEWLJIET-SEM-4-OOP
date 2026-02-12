
import java.io.FileInputStream;

class exception_2 {

    public static void main(String args[]) {

        int a = 10;
        try {

            int b = a / 0;
           
        } catch (ArithmeticException e) {
            System.out.println(e);}
        try {
                int arr[] = new int[5];
                arr[10] = 50;
            }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
