public class Static_Diff_Class
{
    static int a = 10;
    static void display()
    {
        System.out.println("STATIC METHOD");
    }
    static
    {
        System.out.println("STATIC BLOCK");
    }
}

class Static_Main
{
    public static void main(String[] args)
    {
        Static_Diff_Class obj = new Static_Diff_Class(); //Object Create
    System.out.println("Main"); // Main Class
    Static_Diff_Class.display(); // Reference of Class name
    System.out.println("Static Variable : " +obj.a); // Reference of Object
    }
}