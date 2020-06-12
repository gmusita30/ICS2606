import java.util.Scanner;

/**
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		
		int peso, dollar, choice;
		double peso_decimal, dollar_decimal;
		Scanner input = new Scanner(System.in);
		System.out.println("Input how much dollars you want to be "
				+ "exchanged in peso: ");
		dollar = input.nextInt();
		dollar_decimal = dollar;
		peso = 52;
		peso_decimal = 52.28;
		
		int exchange_result = resultFunction(dollar, peso);
		double exchange_result2 = resultFunction(dollar_decimal, peso_decimal);
		
		System.out.println("Your amount in value peso is (integer): " + "P"+exchange_result);
		System.out.println("your amount in peso is (double): " + "P"+exchange_result2);
		
		System.out.println("\n\nPick the number for another currency "
				+ "exchange for dollars: " + "\n1\t\tYEN" +
				"\n2\t\tPOUND" + "\n3\t\tEURO");
		choice = input.nextInt();
		currencyExchange(choice, dollar);
		
		System.out.println("\n\nEnter the amount you want your dollar multiplied: ");
		int multiplier = input.nextInt();
		int product = multipleFunction(multiplier, dollar);
		System.out.println("Your product is: " + "$" + product );
		
		input.close();
		
	}
	
	public static int multipleFunction(int n1, int n2)
	{
		int i = 0;
		int j = n1;
		while (i < n2-1)
		{
			n1 += j;
			i++;		
		}
		return n1;
	}
	
	public static void currencyExchange(int currency, int n1)
	{
		if (currency == 1)
		{
			int yen = 110;
			int result = n1 * yen;
			System.out.println("You have: "+ "¥" +result);
		}
		else if (currency == 2)
		{
			double pound = 0.72;
			double n1_2 = n1;
			double result = n1_2 * pound;
			System.out.println("You have: " + "£" + result);	
		}
		else if (currency == 3)
		{
			double euro = 0.88;
			double n1_2 = n1;
			double result = n1_2 * euro;
			System.out.println("You have: " + "€" + result);	
		}
	}
	
	public static int resultFunction(int n1, int n2)
	{
		int exchange;
		exchange = n1 * n2;
		return exchange;
	}
	
	public static double resultFunction(double n1, double n2)
	{
		double exchange;
		exchange = n1 * n2;
		return exchange;
	}

}
**/










/*

//mport java.util.Scanner;

public class NumberHolder {
	
	 
	public static int anInt;
	public static float aFloat;
	//public static float product;

	public static void main(String args[]) {
		/**
		Scanner input = new Scanner(System.in); 
		//String gago;
		String bobo;
		//NumberHolder a = new NumberHolder();
		//NumberHolder b = new NumberHolder();
		//String anInt;
		//String aFloat;
			
		System.out.println("Enter an integer");
	     anInt = input.nextLine();
		System.out.println("Enter an float ");
		 aFloat= input.nextLine();
		 
		NumberHolder.anInt = 23;
		NumberHolder.aFloat = 5.342234f;
		//NumberHolder.product = anInt * aFloat;
	
	
		
		//NumberHolder a = new NumberHolder();
		//NumberHolder b = new NumberHolder();
		//a.anInt = 5;
		//b.aFloat = 62.12f;
		/**
		System.out.println("Enter an integer");
		int anInt  = input.nextLine();
		System.out.println("Enter an float ");
		float aFloat = input.nextLine();
		
		System.out.println("integer = " + anInt);
		System.out.println("float = " + aFloat);
		System.out.println("product = " + (anInt * aFloat));
	
	}
	
}
**/

/**
import java.util.Scanner;

class Super_class {
	   int num1;

	   // display method of superclass
	   public void display() {
	      System.out.println("This is the display method of superclass");
	   }
	}

	public class Hello extends Super_class {
	   int num2;

	   // display method of sub class
	   public void display() {
	      System.out.println("This is the display method of subclass");
	   }

	   public void my_method() {
	      // Instantiating subclass
		   Hello sub = new Hello();

	      // Invoking the display() method of sub class
	      sub.display();

	      // Invoking the display() method of superclass
	      super.display();
	      
	      Scanner pro = new Scanner(System.in);
		  System.out.println("Enter Super Class value: ");
		  num1 = pro.nextInt();
		  
		  System.out.println("Enter Subclass value: ");
		  num2 = pro.nextInt();
	      sub.num2 = num2;
		  // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ sub.num2);

	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num1);
	      pro.close();
	   }

	   public static void main(String args[]) {
		   		   
		   Hello obj = new Hello();
		   obj.my_method();
		   
		   
		   
	   }
	}
**/


/**
import java.util.Scanner;

class Super_class {
	   int num1;

	   // display method of superclass
	   public void addition(int x, int y) {
		   
		   num1 = x + y;
		      System.out.println("The sum of the given numbers:"+ num1);
	     // System.out.println("This is the display method of superclass");
	   }
	      public void subtraction(int x, int y)
		   {
		      num1 = x - y;
		      System.out.println("The difference between the given numbers:"+ num1);
		   
	   }
	}

	public class Inheritance_Sam extends Super_class {
	   int num2;

	   // display method of sub class
	   public void product(int x, int y) {
		   
		   num2 = x * y;
			 
			  
		      System.out.println("The product of the given numbers:"+ num2);
	      //System.out.println("This is the display method of subclass");
	   }
	   
	   public void quotient(int x, int y) 
	   {
	       num2 = x / y;
		 
			  
	      System.out.println("The quotient of the given numbers:"+ num2);
	   }
		
	   public static void main(String args[]) {
	  // public void  my_method() {
	      // Instantiating subclass
		   //Inheritance_Sam sub = new Inheritance_Sam();

	      // Invoking the display() method of sub class
	     // sub.display();

	      // Invoking the display() method of superclass
	     // super.display();
	      
	      Scanner superman = new Scanner(System.in);
		  System.out.println("Enter Super Class value: ");
		  int num1 = superman.nextInt();
		  
		  System.out.println("Enter Subclass value: ");
		  int num2 = superman.nextInt();
	      //sub.num2 = num2;
		  // printing the value of variable num of subclass
	      //System.out.println("value of the variable named num in sub class:"+ sub.num2);

	      // printing the value of variable num of superclass
	      //System.out.println("value of the variable named num in super class:"+ super.num1);
		  
	      //superman.close();

	      
	   

	 //  public static void main(String args[]) {
		  // Inheritance_Sam obj = new Inheritance_Sam();
	     // obj.my_method();
		   Inheritance_Sam demo = new Inheritance_Sam();
		      demo.addition(num1,num2 );
		      demo.subtraction(num1, num2);
		      demo.product(num1, num2);
		      demo.quotient(num1,num2);
	   }
	}
**/





import java.util.Scanner;

class Seasons{
	
	String toyota = "\n AE86" 
				+ "\n SUPRA"
				+ "\n CELICA";
	
	String nissan = "\n GTR" 
			    + "\n SYLVIA"
			    + "\n 350Z";
	
	String honda = "CIVIC" 
		    + "\n NSX"
		    + "\n S2000";
	
	String mazda = "\n RX7" 
		    + "\n MIATA"
		    + "\n RX8";
	public void season1(String s01) {
		System.out.println("s01e1");
	}
	
	public void season2(String s02) {
		System.out.println("s02e1");		
	}
	
	public void season3(String s03) {
		System.out.println("s03e1");
	}
	
	public void season4(String s04) {
		System.out.println("s04e1");
	}
}

class SeasonNumber extends Seasons{
	
	
	  public void getDigits() {
		   Scanner s = new Scanner(System.in); 
			System.out.println("Choose a car make you like the most  \n (toyota,nissan,honda,mazda)");
			int a = 0;
			a = s.nextInt();
		    s.close();
	 

	if ( a > 0 == a < 2 ) {
		System.out.println("Iconic cars of toyota " + toyota);
	}
	
	if ( a > 1 == a < 3 ) {
		System.out.println("Iconic cars of nissan " + nissan);
	}
	
	if ( a > 2 == a < 4 ) {
		System.out.println("Iconic cars of honda " + honda);
	}
	
	if ( a > 3 == a < 5 ) {
		System.out.println("Iconic cars of mazda " + mazda);
	}
	
	  }
}

public class Hello extends SeasonNumber{
	
	public static void main(String[] args) {
		 
		SeasonNumber nyek = new SeasonNumber();
		nyek.getDigits();
		
	}

}