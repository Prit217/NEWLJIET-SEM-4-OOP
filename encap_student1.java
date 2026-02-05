class encap_student
{
  private int id;

  public void setId(int i)
  {
    id=1;
  }
  public int getId()
  {
    return id;
  }
}
class encap_student1
{
  public static void main(String[] args) {
      encap_student s=new encap_student();
      s.setId(1);
      System.out.println(s.getId());

  }
}