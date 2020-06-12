/*
post pre:

x*((3+4/y)-2)
(a+b)/(c-d*e)
a+b/c-d*e
eval ex:
4 3 5 * 7 + 6 2 / - *
2 2 6 8 + 9 - 6 * + 4 / ^
-+7/93*24
 **/
/*
import java.util.Scanner;
import java.util.Stack; 

public class KathBano
{ 
	static boolean isOperator(char c) 
	 { 
	     return (!(c >= 'a' && c <= 'z') &&  
	             !(c >= '0' && c <= '9') &&  
	             !(c >= 'A' && c <= 'Z')); 
	 } 
	   
	 static int getPriority(char C) 
	 { 
	     if (C == '-' || C == '+') 
	         return 1; 
	     else if (C == '*' || C == '/') 
	         return 2; 
	     else if (C == '^') 
	         return 3; 
	     return 0; 
	 } 
	
	static int Prec(char ch) 
	{ 
		switch (ch) 
		{ 
		case '+': 
		case '-': 
			return 1; 
	
		case '*': 
		case '/': 
			return 2; 
	
		case '^': 
			return 3; 
		} 
		return -1; 
	} 
	static String infixToPrefix(String infix) 
	 { 
	  
	     Stack<Character> operators = new Stack<Character>(); 
	     Stack<String> operands = new Stack<String>(); 
	   
	     for (int i = 0; i < infix.length(); i++)  
	     { 
	   
	         if (infix.charAt(i) == '(')  
	         { 
	             operators.push(infix.charAt(i)); 
	         } 
	   
	         else if (infix.charAt(i) == ')')  
	         { 
	             while (!operators.empty() &&  
	                 operators.peek() != '(')  
	                 { 
	   
	                 String op1 = operands.peek(); 
	                 operands.pop(); 
	   
	                 String op2 = operands.peek(); 
	                 operands.pop(); 
	   
	                 char op = operators.peek(); 
	                 operators.pop(); 
	   
	                 String tmp = op + op2 + op1; 
	                 operands.push(tmp); 
	             } 
	    
	             operators.pop(); 
	         } 

	         else if (!isOperator(infix.charAt(i)))  
	         { 
	             operands.push(infix.charAt(i) + ""); 
	         } 
	   
	         else 
	         { 
	             while (!operators.empty() &&  
	                 getPriority(infix.charAt(i)) <=  
	                     getPriority(operators.peek()))  
	                 { 
	   
	                 String op1 = operands.peek(); 
	                 operands.pop(); 
	   
	                 String op2 = operands.peek(); 
	                 operands.pop(); 
	   
	                 char op = operators.peek(); 
	                 operators.pop(); 
	   
	                 String tmp = op + op2 + op1; 
	                 operands.push(tmp); 
	             } 
	   
	             operators.push(infix.charAt(i)); 
	         } 
	     } 

	     while (!operators.empty())  
	     { 
	         String op1 = operands.peek(); 
	         operands.pop(); 
	   
	         String op2 = operands.peek(); 
	         operands.pop(); 
	   
	         char op = operators.peek(); 
	         operators.pop(); 
	   
	         String tmp = op + op2 + op1; 
	         operands.push(tmp); 
	     } 
	  
	     return operands.peek(); 
	 } 
	 
	static String infixToPostfix(String exp) 
	{ 
		
		String result = new String(""); 
		
 
		Stack<Character> stack = new Stack<>(); 
		
		for (int i = 0; i<exp.length(); ++i) 
		{ 
			char c = exp.charAt(i); 
			
		
			if (Character.isLetterOrDigit(c)) 
				result += c; 
			
	
			else if (c == '(') 
				stack.push(c); 
			
			else if (c == ')') 
			{ 
				while (!stack.isEmpty() && stack.peek() != '(') 
					result += stack.pop(); 
				
				if (!stack.isEmpty() && stack.peek() != '(') 
					return "Invalid Expression"; 			 
				else
					stack.pop(); 
			} 
			else 
			{ 
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
					if(stack.peek() == '(') 
						return "Invalid Expression"; 
					result += stack.pop(); 
			} 
				stack.push(c); 
			} 
	
		} 
	
		while (!stack.isEmpty()){ 
			if(stack.peek() == '(') 
				return "Invalid Expression"; 
			result += stack.pop(); 
		} 
		return result; 
	} 
	 
	public static void main(String[] args) 
	{ 
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter expression: ");
		 String exp = sc.next(); 
		System.out.println("Converted to Postfix:\n" + infixToPostfix(exp)); 
		System.out.println("Converted to Prefix:\n" + infixToPrefix(exp)); 
	} 
} 

**/
/*
import java.util.Scanner;
import java.util.Stack; 
public class KathBano{
	public static void main(String[] args){
		//String s="-+7/93*24";
		Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter expression: ");
		 String exp = sc.next(); 
		//System.out.println(evaluatePostfix(sc));
		 System.out.println("Prefix eval:\n" + evaluatePostfix(exp));
	}
	
	
	static int evaluatePostfix(String a){
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=a.length()-1;i>=0;i--){
				if(isOperand(a.charAt(i))){
					int y=Integer.parseInt(String.valueOf(a.charAt(i)));
					//System.out.println(y);
					s.push(y);
				}
				else{
					int A=s.pop();
					int B=s.pop();
					int x=eval(A,a.charAt(i),B);
					s.push(x);
				}
				
		}
		
		return s.pop();
	}
	
	static boolean isOperand(char x){
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
	
	
	
	static int eval(int A,char e, int B){
		switch(e){
			case '^':
				return power(A,B);
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
	
	static int power(int a,int b){
		int pow=0;
		for(int i=0;i<b;i++){
			pow*=a;
		}
		
		return pow;
	}
	
	static int div(int a, int b){
		return a/b;
	}
	
	static int mult(int a,int b){
		return a*b;
	}
	
	static int add(int a, int b){
		return a+b;
	}
	
	static int sub(int a, int b){
		return a-b;
	}

}
**/
/*
import java.util.Scanner;
import java.util.Stack;
public class KathBano{
	public static void main(String[] args){
		//String s="-+7/93*24";
		//System.out.println(evaluatePostfix(s));
		Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter expression: ");
		 String exp = sc.next(); 
		
		 System.out.println("Prefix eval:\n" + evaluatePostfix(exp));

	}
	
	
	
	static int evaluatePostfix(String a){
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=0;i<a.length();i++){
				if(isOperand(a.charAt(i))){
					int y=Integer.parseInt(String.valueOf(a.charAt(i)));
					//System.out.println(y);
					s.push(y);
				}
				else{
					int B=s.pop();
					int A=s.pop();
					int x=eval(A,a.charAt(i),B);
					s.push(x);
				}
				
		}
		
		return s.pop();
	}
	
	static boolean isOperand(char x){
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
	
	
	
	static int eval(int A,char e, int B){
		switch(e){
			case '^':
				return power(A,B);
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
	
	static int power(int a,int b){
		int pow=0;
		for(int i=0;i<b;i++){
			pow*=a;
		}
		
		return pow;
	}
	
	static int div(int a, int b){
		return a/b;
	}
	
	static int mult(int a,int b){
		return a*b;
	}
	
	static int add(int a, int b){
		return a+b;
	}
	
	static int sub(int a, int b){
		return a-b;
	}

}
**/
/*
import java.util.Scanner;
import java.util.Stack;

public class KathBano {
	static int choice;
	static Scanner s1 = new Scanner(System.in);	


	static int prefixEval(String a)
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
	
	static int postfixEval(String a)
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
				return caret(A,B);
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
	
	static int caret(int a,int b)
	{
		int pow=0;
		for(int i=0;i<b;i++)
		{
			pow*=a;
		}
		return pow;
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
		System.out.print(":::::::::::Postfix and Prefix Evaluator | Made by Cyril Verdad:::::::::: \n\n"
		           + "1. Enter Prefix \n"
		           + "2. Enter Postfix \n"
		           + "3. Exit \n"
		           + "\nChoice: ");
		choice = s1.nextInt();
	}
	
	
	public static void main(String[] args)
	{
		String s = "";
		while (choice != 3)
		{
			generate();
			if (choice == 1)
			{
				System.out.print("Please enter a Prefix Expression: ");
				s = s1.next();
				System.out.println("\nThe expression is equal to: " + prefixEval(s) + "\n");
			}
			if (choice == 2)
			{
				System.out.print("Please enter a Postfix Expression: ");
				s = s1.next();
				System.out.println("\nThe expression is equal to: " + postfixEval(s) + "\n");
			}
			if (choice == 3)
			{
				System.out.print("\nThank you for using Postfix and Prefix Evaluator. Goodbye.");
			}
		}
	}
}
**/
/*
import java.util.*;
public class KathBano<T>
	{
	
		private int maxQsize=100;
		private int front = -1, rear = -1;
		private Object[] que;
		public KathBano()
		{
			this.que =  new Object[maxQsize];
		}
	
		public KathBano(int n)
		{
			if(n  > 0) 
				this.maxQsize = n;
			this.que = new Object[maxQsize];
		}
	
		public void clear()
		{
			this.front=-1;
			this.rear=-1;
		}
		
		public boolean isEmpty()
		{
			return(this.front == -1);
		}
	
		public boolean isFull()
		{
			return((this.rear+1) % this.maxQsize == this.front);
		}
	
		public T enqueue(T el)
		{
			if(isFull())
			{
				System.out.println("Queue is Full");
				return null;
			}
			if(isEmpty())
			{
				this.front = 0;
			}
			this.rear = (this.rear + 1) % maxQsize;
			this.que[rear] = el;
			return el;
		}
	
		public T dequeue()
		{
			if(isEmpty())
			{
				return null;
			}
			T el = (T) this.que[front];
			if(this.front == this.rear)
			{
				this.clear();
			}
			else
			{
				this.front = (this.front + 1) % this.maxQsize;
			}
			return el;
		}
	
		public  T peek()
		{
			if(isEmpty())
			{
				return null;
			}
			else
			{
				return (T) this.que[front]; 
			}
		}
		
		public void printQueue(){
			int x=this.front;
			
			if(this.isEmpty()){
				System.out.println("null");
			}
			
			else if(this.front==this.rear){
				System.out.print(this.que[x]);
			}
			
			else{
				do{
					if(this.que[x]!=null){
						System.out.print(this.que[x]+",");
						x=(x+1)%this.maxQsize;
					}
				}while(x!=this.rear);
				System.out.print(this.que[rear]);
			}
			
		}
	}
**/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package exercise.pkg1;

/**
import java.util.Scanner;
public class KathBano {

   
    public static void main(String[] args) {
       String name = null;
       String name1 = "";
       int total = 0;  
       int basketball = 0;
       int volleyball = 0;
        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings! Please Select Team");
        System.out.println("_______________________");
        System.out.println("-------------------------");
        System.out.println("[1] Basketball");
        System.out.println("[2] VolleyBall");
        System.out.println("[3] Open Slots Left");
        System.out.println("[4] Exit");
        System.out.println("-------------------------");
        System.out.println("_______________________");
        System.out.println("");
        System.out.println("Choice: ");
        int choice = scan.nextInt();
        System.out.println("");
       
        switch(choice){
            case 1:
            	
                    System.out.println("Enter name: ");
                     name = scan.next();
                    System.out.println("Enter age: ");
        int age = scan.nextInt();
        if(basketball >=2){
            System.out.println("Basketball team is no longer accepting applicants");
        }
        else if(age >= 18 && age <= 21){
                        System.out.println("Welcome to the Basketball Team!");
                        basketball = basketball + 1;
                        total = total + 1;
        }
        else{
                       
                        System.out.println("Sorry, you are not qualified!");
        }
            break;
            case 2:
                    System.out.println("Enter name: ");
                    name1 = scan.next();
                    System.out.println("Enter age: ");
                    int age1 = scan.nextInt();
                    if(volleyball >=3){
                        System.out.println("Volleyball team is no longer accepting applicants.");
                    }
                    else if(age1 >=17 && age1 <= 19 ){
                       
                        System.out.println("Welcome to the Volleyball Team!");
                        volleyball = volleyball + 1;
                        total = total + 1;
                    }
                    else{
                        System.out.println("Sorry, you are not qualified!");
                    }
            break;
             case 3:
            	 
            	 System.out.println("Current number of recruits: \n");
            	 System.out.println("Basketball team = "+ basketball + "\n" + name );
            	 System.out.println("Volleyball team = "+ volleyball + "\n" + name1 + "\n");
                 break;

             case 4:
            	 System.out.println("The program ends here");
            	 return;
        }
    }while(total !=5);
        }
    }

*/

import java.util.Scanner;

public class KathBano {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        int bmem = 0, vmem = 0, ctr;
        boolean cont = true;
        String[] baskmem = new String[2];
        String[] vollmem = new String[3];
        int[] baskage = new int[2];
        int[] vollage = new int[3];
        while(cont)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Select Team");
            System.out.println("-------------");
            System.out.println("[1] Basketball");
            System.out.println("[2] Volleyball");
            System.out.println("[3] Open Slots Left");
            System.out.println("[4] Exit");
            System.out.println("-------------");
            System.out.print("Choice: ");
            int choice = scan.nextInt();
            System.out.print("\n");
            switch(choice)
            {
                case 1:
                    Scanner bscan = new Scanner(System.in);
                    
                    bmem = bmem + 1;
                    if(bmem > 2)
                    {
                        System.out.println("\nBasketball team is no longer accepting applicants.");
                        bmem = bmem - 1;
                    }
                    else
                    {
                        System.out.print("Enter Name: ");
                        baskmem[bmem - 1] = bscan.nextLine();                
                        System.out.print("Enter Age: ");
                        baskage[bmem - 1] = bscan.nextInt();
                        if(baskage[bmem - 1] < 18 || baskage[bmem - 1] > 21)
                        {
                            System.out.println("\nSorry, you are not qualified!");
                            baskmem[bmem - 1] = null;
                            baskage[bmem - 1] = 0;
                            bmem = bmem - 1;
                        }
                        else
                        {
                            System.out.println("\nWelcome to the Basketball Team!");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    Scanner vscan = new Scanner(System.in);
                    
                    vmem = vmem + 1;
                    if(vmem > 3)
                    {
                        System.out.println("\nVolleyball team is no longer accepting applicants.");
                        vmem = vmem - 1;
                    }
                    else
                    {
                        System.out.print("Enter Name: ");
                        vollmem[vmem - 1] = vscan.nextLine();                
                        System.out.print("Enter Age: ");
                        vollage[vmem - 1] = vscan.nextInt();
                        if(vollage[vmem - 1] < 17 || vollage[vmem - 1] > 19)
                        {
                            System.out.println("\nSorry, you are not qualified!");
                            vollmem[vmem - 1] = null;
                            vollage[vmem - 1] = 0;
                            vmem = vmem - 1;
                        }
                        else
                        {
                            System.out.println("\nWelcome to the Volleyball Team!");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Current number of recruits: ");
                    System.out.println(bmem + vmem);
                    System.out.print("\nBasketball Team = ");
                    System.out.println(bmem);
                    for(ctr = 0; ctr < bmem; ctr++)
                    {
                        System.out.print(baskmem[ctr] + " - ");
                        System.out.println(baskage[ctr] + " years old");
                    }
                    System.out.print("\nVolleyball Team = ");
                    System.out.println(vmem);
                    for(ctr = 0; ctr < vmem; ctr++)
                    {
                        System.out.print(vollmem[ctr] + " - ");
                        System.out.println(vollage[ctr] + " years old");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid Input! Please choose between 1 - 4.");
                    System.out.println("\n");
            }
        }
    }
}
