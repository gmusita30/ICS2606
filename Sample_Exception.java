import java.util.*;

public class Sample_Exception
{
   static Scanner console = new Scanner(System.in);

   static final double CONVERSION = 2.54;
   static final int INCHES_PER_FOOT = 12;

   public static void main (String[] args)
   {
            //declare variables
      	int feet;
        int inches;
      	int totalInches;
      	double centimeter;

      	feet = getNum("feet");
      	inches = getNum("inches");

      	System.out.println();

      	System.out.println("The numbers you entered are "
                        + feet + " for feet " + "and "
                        + inches + " for inches. ");

      	totalInches = INCHES_PER_FOOT * feet + inches;

      	System.out.println();
      	System.out.println("The total number of inches = "
                        + totalInches);

      	centimeter = totalInches * CONVERSION;

      	System.out.printf("The number of centimeters = %.2f%n", centimeter);

   }

   public static int getNum(String str)
   {
        int num = 0;
        boolean done = false;

        do
        {
            try
            {
                System.out.print("Enter the " + str + ": ");
                num = console.nextInt();
                System.out.println();

                if (num < 0)
                    throw new Exception("Number cannot be negative");


                done = true;
            }
            catch (InputMismatchException nfeRef)
            {
				console.nextLine();
                System.out.println("\nException " + nfeRef.toString());
            }
            catch (Exception e)
            {
                System.out.println("\nException " + e.toString());
            }

        }
        while (!done);

        return num;
   }
}


