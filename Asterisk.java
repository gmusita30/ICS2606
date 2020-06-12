import java.util.Scanner;
public class Asterisk
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println( "Please enter the number of asterisk you want: ");
		int a  = s.nextInt();
		
		System.out.println("Quadrant 1");
		for (int b = 0; b < a ; b++)
		{
			
			for (int c = 0; c <= b; c++)
			{
				System.out.print("*");
			}
		System.out.println();		
		}
		
		System.out.println("Quadrant 2 ");
		for (int b = 1; b <= a ; b++)
		{
			
			for (int c = a; c >= 1; c--)
			{
				if(c>b)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		
		System.out.println();		
		}
		
		System.out.println("Quadrant 3");
		for (int b = 1; b <= a ; b++)
		{
			
			for (int c = 1; c <= a; c++)
			{
				if(c<b)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		
		System.out.println();		
		}
		
		System.out.println("Quadrant 4");
		for (int b = 1; b <= a ; b++)
		{
			
			for (int c = a; c >= 1; c--)
			{
				if(c>=b)
					System.out.print("*");
				/*else
					System.out.print("*");
				*/
			}
		
		System.out.println();		
		}
	}
}