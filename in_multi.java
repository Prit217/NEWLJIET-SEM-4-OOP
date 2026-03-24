interface print
{
    void printing();
}

interface copy
{
    void copying();
}

interface scan
{
    void scanning();
}

class in_multi implements print, copy, scan
{
    public void printing()
    {
        System.out.println("printer can printing");
    }
    public void copying()
    {
        System.out.println("printer can copying");
    }
    public void scanning()
    {
        System.out.println("printer can scanning");
    }

    public static void main(String[] args) {
        in_multi obj=new in_multi();
        obj.printing();
        obj.copying();
        obj.scanning();
    }
}