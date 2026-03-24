import java.io.File;
import java.io.IOException;
public class file {
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\julig\\NEWLJIET-SEM-4-OOP\\NEWLJIET-SEM-4-OOP\\file.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}