import java.util.Scanner;
import java.util.Random;
public class Fraction
{
   public static void main ( String [] args )
    {
       int num;
       int den;
       double result;


       num = getNum();
       den = getDen();
       result = getResult(num, den);
       printResult(num, den, result);

    }

    public static int getNum()
     {
    Scanner input = new Scanner (System.in);

    int num;

    System.out.print("Please enter the numerator: ");
    num = input.nextInt();

    return num;
     }

    public static int getDen()
        {
       Scanner input = new Scanner (System.in);

       int den;
       System.out.print("Please enter the denominator: ");
       den = input.nextInt();

       return den;

        }


public static double getResult(int num, int den)
{
    double result;
    result = num / den;
    return result;
}

public static void printResult(int num, int den, double result)
{
System.out.printf("The fraction %d / %d in decimal form is %f\n", num, den, result);
}}