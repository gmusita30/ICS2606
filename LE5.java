import java.util.Scanner;
public class LE5
{
	public static void main(String args[])
	{
		int a = 0;
		int	b = 0;
		int	product = 0;
		int	modulo = 0;
		int	quo = 0;
		int	temp = 0;
			
		Scanner s = new Scanner(System.in);

		System.out.print("\nEnter first number: ");
			a = s.nextInt();
		
		System.out.print("Enter second number: ");
			b = s.nextInt();

		
		for(int i = 0; i < b; i++)
			product += a;

		System.out.print("\nThe product of " + a + " and " + b + " is: " + product);

		
		temp = a;
		while(b <= temp)
		{
			modulo = temp - b;
			temp = modulo;
			quo++;
		}

		System.out.print("\nThe int quo of " + a + " and " + b + " is: " + quo);
		System.out.print("\nThe modulo of " + a + " and " + b + " is: " + modulo);
		
		System.out.println();
		s.close();

	}
}