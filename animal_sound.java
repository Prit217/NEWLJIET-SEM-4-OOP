abstract class animal
{
    
    abstract void sound();
}
class dog extends animal
{
    public void sound()
    {
        System.out.println("dog barks");
    }
}
class cat extends animal
{
    public void sound()
    {
        System.out.println("cat meows");
    }
}
class cow extends animal
{
    public void sound()
    {
        System.out.println("cow moos");
    }
}
public class animal_sound {
    public static void main(String[] args) {
        animal d=new dog();
        animal c=new cat();
        animal co=new cow();
        
        d.sound();
        c.sound();
        co.sound();
        
    }
}