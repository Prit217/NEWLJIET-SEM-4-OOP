import java.io.File;
import java.io.FileWriter;
class F_write_read
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\julig\\NEWLJIET-SEM-4-OOP\\NEWLJIET-SEM-4-OOP\\file.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Hello");
        writer.close();
        System.out.println("Successfully wrote to the file.");

        FileReader reader = new FileReader(file);
        int i;

        while((i=reader.read())!=-1)
        {
            System.out.print((char)i);
        }
        reader.close();
    }
}