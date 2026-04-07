import java.io.*;

class Q12_student
{
  String id;
  String name;
  int rollno;


  Q12_student(String id, String name, int rollno)
  {
    this.id = id;
    this.name = name;
    this.rollno = rollno;
  }

  public String toString()
  {
    return "ID: " + id + ", Name: " + name + ", Roll No: " + rollno;
  }
}

class Studentmanager
{
  public static void main(String[] args) {
      try{

        Q12_student s1 = new Q12_student("S001", "Alice", 101);
        Q12_student s2 = new Q12_student("S002", "Bob", 102);
        Q12_student s3 = new Q12_student("S003", "Charlie", 103);

        FileOutputStream fos = new FileOutputStream("students.txt") ;
        fos.write(s1.toString().getBytes());
        fos.write(s2.toString().getBytes());
        fos.write(s3.toString().getBytes());
        fos.close();

        System.out.println("Student details written to file successfully.");

        FileInputStream fis = new FileInputStream("students.txt"); 
      
        int i;
        System.out.println("Student details read from file:");
        while((i = fis.read()) != -1)
        {
          System.out.print((char)i);
        }
        fis.close();

      }
      catch(Exception e)
      {
        System.out.println(e);
      }
  }
}