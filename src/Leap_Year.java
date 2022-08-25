// Leap Year
import java.util.Scanner;
public class Leap_Year
{
    public static void main(String[] args)
    {
        System.out.print("Enter Year : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) )
            System.out.println(year+ " is Leap Year");
        else System.out.println(year+ " is Not a Leap Year");
    }
}
