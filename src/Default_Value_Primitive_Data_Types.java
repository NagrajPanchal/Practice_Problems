public class Default_Value_Primitive_Data_Types
{
byte b; //variable Declaration
short s;
int i;
long l;
float f;
double d;
boolean flag;
char ch;

    public static void main(String[] args)
    {
        Default_Value_Primitive_Data_Types obj = new Default_Value_Primitive_Data_Types(); // Object Created for above class
        System.out.println("The Default value of byte is : " +obj.b); // Display the result by using object
        System.out.println("The Default value of short is : " +obj.s);
        System.out.println("The Default value of integer is : " +obj.i);
        System.out.println("The Default value of Long is : " +obj.l);
        System.out.println("The Default value of float is : " +obj.f);
        System.out.println("The Default value of double is : " +obj.d);
        System.out.println("The Default value of boolean is : " +obj.flag);
        System.out.println("The Default value of Char is : " +obj.ch);
    }
}
