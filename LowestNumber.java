import java.util.Scanner;
public class LowestNumber
{
	public static void main(String args[])
	{
	
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Enter 1st Number");
		a = s.nextInt();
		
		System.out.println("Enter 2nd Number");
		b = s.nextInt();
		
		System.out.println("Enter 3rd Number");
		c = s.nextInt();
		
		System.out.println("The smallest value is " + (a > b ? b : a > c ? c : a));
		
		s.close();
	}
	
}
		
		