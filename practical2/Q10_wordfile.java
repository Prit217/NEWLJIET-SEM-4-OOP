
import java.io.File;
import java.util.Scanner;

class Q10_wordfile {

    public static void main(String[] args) {

      if (args.length < 1) {
            System.out.println("file name provide in command line");
      }

        String filename = args[0];
        int wordcount = 0;

        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            System.out.println("Words in the file:");
            while (sc.hasNext()) {
                sc.next();
                wordcount++;
            }

            sc.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
