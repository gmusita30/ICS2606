
import java.util.Scanner;
import java.util.Stack; 

public class ConversionStack
{ 
	   /*
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
	**/
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
	
	static boolean isOperator(char c) 
	 { 
	     return (!(c >= 'a' && c <= 'z') &&  
	             !(c >= '0' && c <= '9') &&  
	             !(c >= 'A' && c <= 'Z')); 
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
	                 Prec(infix.charAt(i)) <=  
	                     Prec(operators.peek()))  
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
		 Scanner scan = new Scanner(System.in); 
		 System.out.println("Enter an infix expression: ");
		 String exp = scan.next(); 
		 System.out.println("Infix converted to Prefix:\n" + infixToPrefix(exp)); 
		 System.out.println("Infix converted to Postfix:\n" + infixToPostfix(exp)); 
		 
	} 
} 

//Gabriel Adrian M. Usita 2-ITF

