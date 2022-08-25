// String Comparasion
import java.util.Scanner; //Import a User input
public class String_Comparasion  //Class Name
{
    public static void main(String[] args) //main Function
    {
        String a; // Variable declaration
        /*
        //Pre-defined Strings
        String a = "Nagraj"; //String litral //String declaration and initialization
        String b = new String("Nagraj");  // New Keyword
        */
        System.out.println("Enter String : "); //Print Statement
        Scanner scanner = new Scanner(System.in); //System.in is a standard input stream
        a = scanner.nextLine(); //Read String
        System.out.println("Enter String to Compare : ");
        String b = scanner.nextLine(); // String declare and read as user inputs

        if (a.equals(b)) //equals() wil Check only Content //a==b
            System.out.println("String "+a+ " and "+b+"  are Equals");
        else
            System.out.print("String "+a+ " and "+b+"  are Not Equals");


    }
}
