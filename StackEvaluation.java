//Postfix example: 435*7+62/-*
//Prefix example: -+7/93*24

/**
import java.util.Scanner;
import java.util.Stack;

public class StackEvaluation {
	static int choice;
	static Scanner pre = new Scanner(System.in);	


	static int PrefixPostfix(String a)
	{
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=a.length()-1;i>=0;i--)
		{
				if(isOperand(a.charAt(i)))
				{
					int y=Integer.parseInt(String.valueOf(a.charAt(i)));
					s.push(y);
				}
				else
				{
					int A=s.pop();
					int B=s.pop();
					int x=eval(A,a.charAt(i),B);
					s.push(x);
				}
		}
		
		return s.pop();
	}
	
	static int PostfixPrefix(String a)
	{
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=0;i<a.length();i++)
		{
				if(isOperand(a.charAt(i))){
					int y=Integer.parseInt(String.valueOf(a.charAt(i)));
					s.push(y);
				}
				else
				{
					int B=s.pop();
					int A=s.pop();
					int x=eval(A,a.charAt(i),B);
					s.push(x);
				}
				
		}
		
		return s.pop();
	}
	
	static boolean isOperand(char x)
	{
		switch(x){
			case '^':
				return false;
			case '/':
				return false;
			case '*':
				return false;
			case '+':
				return false;
			case '-':
				return false;
			default:
				return true;
		}
	}
	
	static int eval(int A,char e, int B)
	{
		switch(e){
			case '^':
				return expo(A,B);
			case '/':
				return div(A,B);
			case '*':
				return mult(A,B);
			case '+':
				return add(A,B);
			case '-':
				return sub(A,B);
			default:
				return 0; 
		}
	}
	
	static int expo(int a,int b)
	{
		int power=0;
		for(int i=0;i<b;i++)
		{
			power*=a;
		}
		return power;
	}
	
	static int div(int a, int b)
	{
		return a/b;
	}
	
	static int mult(int a,int b)
	{
		return a*b;
	}
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int sub(int a, int b)
	{
		return a-b;
	}
	
	public static void generate()
	{
		System.out.print("Choose among Prefix and Postfix to evaluate an expression \n\n"
		           + "1. Enter Prefix expression \n"
		           + "2. Enter Postfix expression \n"
		           + "3. Exit \n"
		           + "\nChoice: ");
		choice = pre.nextInt();
	}
	
	
	public static void main(String[] args)
	{
		String scan = "";
		while (choice != 3)
		{
			generate();
			if (choice == 1)
			{
				System.out.print("Please enter a Prefix Expression: ");
				scan = pre.next();
				System.out.println("\nThe expression is equal to: " + PrefixPostfix(scan) + "\n");
			}
			if (choice == 2)
			{
				System.out.print("Please enter a Postfix Expression: ");
				scan = pre.next();
				System.out.println("\nThe expression is equal to: " + PostfixPrefix(scan) + "\n");
			}
			if (choice == 3)
			{
				System.out.print("\nThank you and Goodbye!");
			}
		}
	}
}
*/
//Gabriel Adrian M. Usita 2-ITF

import java.util.Scanner;
public class StackEvaluation {

   
    public static void main(String[] args) {
       String[] mem1 = new String[2];
       String[] mem2 = new String[3];
       int total = 0;  
       int basketball = 0;
       int volleyball = 0;
       int player;
       
        do{
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Select Team");
	        System.out.println("------------------");
	        System.out.println("[1] Basketball");
	        System.out.println("[2] VolleyBall");
	        System.out.println("[3] Open Slots Left");
	        System.out.println("[4] Exit");
	        System.out.println("------------------");
	        System.out.println("");
	        System.out.println("Choice: ");
	        int choice = scan.nextInt();
	        System.out.println("");
	        switch(choice){

            case 1:
                basketball = basketball + 1;
                if(basketball > 2)
                {
                    System.out.println("\nBasketball team is no longer accepting applicants.");
                    basketball = basketball - 1;
                }
                else
                {
                    System.out.print("Enter Name: ");
                    mem1[basketball - 1] = scan.next();                
                    System.out.print("Enter Age: ");
                   int age = scan.nextInt();
                    
                    if(age >= 18 && age <= 21)
                    {
                        System.out.println("\nWelcome to the Basketball Team!");
                        
                    }
                    else
                    {
                        System.out.println("\nSorry, you are not qualified!");
                        mem1[basketball - 1] = null;
                        basketball = basketball - 1;
                    }
                }
                System.out.println("\n");
                break;
	            case 2:
	            	  volleyball = volleyball + 1;
	                  if(volleyball > 3)
	                  {
	                      System.out.println("\nVolleyball team is no longer accepting applicants.");
	                      volleyball = volleyball - 1;
	                  }
	                  else
	                  {
	                      System.out.print("Enter Name: ");
	                      mem2[volleyball - 1] = scan.next();                
	                      System.out.print("Enter Age: ");
	                      int age1 = scan.nextInt();
	                      
	                      if(age1 >= 17 && age1 <= 19)
	                      {
	                          System.out.println("\nWelcome to the Volleyball Team!");
	                         
	                      }
	                      else
	                      {
	                          System.out.println("\nSorry, you are not qualified!");
	                          mem2[volleyball - 1] = null;
	                          volleyball = volleyball - 1;
	                      }
	                  }
	                  System.out.println("\n");
	                  break;
	            case 3:         	 
	            	 System.out.println("Current number of recruits: \n");
	            	 System.out.println("Basketball team = "+ basketball + "\n");
	            	 for(player = 0; player < basketball; player++)
	                 {
	                     System.out.print(mem1[player] + " ");
	                     System.out.print("\n");
	                 }
	            	 System.out.println("\nVolleyball team = "+ volleyball + "\n");
	            	 for(player = 0; player < volleyball; player++)
	                 {
	                     System.out.print(mem2[player] + " ");
	                     System.out.print(" \n");
	                 }
	                 break;
	
	            case 4:
	            	 System.out.println("The program ends here");
	            	 return;
        }
    }while(total !=5);
        }
    }
