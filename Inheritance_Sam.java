import java.util.Scanner;

class Super_class {
	
	public static int num1,num2;
	int result;
	   //int num1;
	
	public void getVal() {
	 Scanner superman = new Scanner(System.in);
	  System.out.println("Enter first value: ");
	   num1 = superman.nextInt();
	  
	  System.out.println("Enter second value: ");
	   num2 = superman.nextInt();
	   
	   superman.close();
	}

	   public void addition(int x, int y) {
		   
		   result = num1 + num2;
		      System.out.println("The sum of the given numbers:"+ result);
	   }
	      public void subtraction(int x, int y) {
	    	  result = num1 - num2;
		      System.out.println("The difference between the given numbers:"+ result);	
	   }
	      
	}

	public class Inheritance_Sam extends Super_class {
	   
	   public void product(int x, int y) {
		   
		   result = num1 * num2;
		   System.out.println("The product of the given numbers:"+ result);
	   }
	   
	   public void quotient(int x, int y) 
	   {
		   double a = num1;
		   double b = num2;
		   double result2 = result;
		   result2 = a / b;  
	      System.out.println("The quotient of the given numbers:"+ result2);
	   }
		
	   
	}