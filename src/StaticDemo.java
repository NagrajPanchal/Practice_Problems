public class StaticDemo
{
    int a= 10;
    static void display()
    {
        System.out.println("Static Method");
    }
    static
    {
        System.out.println("STATIC BLOCK");
    }
    public static void main(String[] args)
    {
        StaticDemo obj = new StaticDemo();
        System.out.println("Static Variable " +obj.a);
        obj.display();
    }
}
