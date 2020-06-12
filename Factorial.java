import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = input.nextInt();
       
        int factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static int multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}