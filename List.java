import java.io.File;
import java.io.IOException;

class List
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\julig\\NEWLJIET-SEM-4-OOP\\NEWLJIET-SEM-4-OOP\\folder");
        String[] fileList = file.list();
        if (fileList != null) {
            for (String name : fileList) {
                System.out.println(name);
            }
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }
}