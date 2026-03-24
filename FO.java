import java.io.File;
import java.io.IOException;

class FO {
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\julig\\NEWLJIET-SEM-4-OOP\\NEWLJIET-SEM-4-OOP\\folder");
        if (file.mkdir()) {
            System.out.println("Folder created.");
        } else {
            System.out.println("Failed to create folder.");
        }
    }
}