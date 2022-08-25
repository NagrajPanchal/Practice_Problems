// Sum of n numbers Using Command line Arguments


public class Sum_Command_line_Arguments //Class with class name
{
    public static void main(String args[]) //main class
    {
    int i, sum=0; //Variable Declaration
    for (i=0; i< args.length; i++) //Length of Arguments
    {
        sum = sum + Integer.parseInt(args[i]); //Sum Command line Arguments
    }
    System.out.println("Sum of the Arguments : " +sum); //Print Statement with "Results"
    }
}

/*
Run this Program in Command with Arguments
or else
if you wants to Run this Intelige
Click on Run - > Edit Configuration -> add Program Arguments -> Click ok
Select Class name and Run
it will run a Command line with Arguments

 */