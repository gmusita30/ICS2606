
import java.util.Scanner;
public class StackOperations<T> {
	
		static final int MAX=5;
		int top=-1;
	
		int[] stack=new int[MAX];

		
		public static void main(String[] args) 
		{	
			
			StackOperations operator = new StackOperations();
		    //int enq;
			int selection,val;
		    Scanner input = new Scanner(System.in);
		    Scanner stack = new Scanner(System.in);
		   
		    
				do 
				{
					
				    System.out.println("Choose a function you want to implement:");
				    System.out.println("1 - New Stack");
				    System.out.println("2 - Clear Stack");
				    System.out.println("3 - isFull");
				    System.out.println("4 - isEmpty");
				    System.out.println("5 - Enqueue");
				    System.out.println("6 - Dequeue");
				    System.out.println("7 - Peek Stack");
				    System.out.println("8 - Display Stack");
				    System.out.println("9 - Quit Stack"); 
				    System.out.print("\nEnter number (1-9): "); 
				    
				    selection = input.nextInt();
				    
				    switch (selection)
				    {
				        case 1:
				        	 
			                 break;
				        
				        case 2: 
				            break;
				        
				        case 3: operator.isFull();
				        	
				            break;
				        
				        case 4: operator.isEmpty();
				        	 
			                 break;
			             
				        case 5: 
				        	if (operator.isFull()) {
								System.out.println("Stack is Full" +"\n" +"\n");
							}
							else {
				        	System.out.print("Enter the value to be added to the stack: ");
		                    val=stack.nextInt();
		                    operator.enqueue(selection);
				        
				        	 //break;
							}
				    
				        case 6: operator.dequeue();
				         
				        	 break;
				       
				      
				        /*
				        case 6: operator.pop();
				        	 
			                 break;
				        
				        case 7: operator.peek();
				        	 
			                 break;
				        **/
				        case 8: operator.display();
				        	 
			                 break;
				        
				        case 9:
				        	System.out.print("Thank you and Goodbye!");
				        	System.exit(0);
			                 break;

				        default:
				            System.out.println("Selection must be between 1 and 9 only.");
				    } 
			    } while (selection != 9);
		}
		/*
		public void push(int val)
		{
		    if(top==MAX-1)
		    {
		        System.out.println("Stack is FULL!");
		    }
		    else
		    {
		        top++;
		        stack[top]=val;
		        System.out.println("Element added to the stack is: "+val+"\n");
		        
		    }
		}
		**/
		public void display()
		{
		    int i;
		    if(top==-1)
		    System.out.println("STACK IS EMPTY!"+"\n");
		    else
		    {
		        for(i=0; i<=top; i++)
		        System.out.print(stack[i]+" "+"\n");
		    }

		}
		/*
		public void isEmpty()
		{
			int info;
		    if(top==-1)
		    System.out.println("STACK IS EMPTY!"+"\n");
		    
		    else
		    	System.out.print("STACK IS NOT EMPTY"+"\n");
		}
		**/
		/*
		public void isFull()
		{
		    if(top==MAX-1)
		    {
		        System.out.println("STACK IS FULL!"+"\n");
		    }
		    else
		    	System.out.print("STACK IS NOT FULL"+"\n");
		}
		
		public void peek()
		{
		    int num;
		    num=stack[top];
		    System.out.println("The value at the top of the stack is: "+num+"\n");
		}
		
		public void pop()
		{
		    int tech;
		    if(top==-1)
		    {
		        System.out.println("STACK IS EMPTY!"+"\n");
		    }
		    else
		    {
		        tech=stack[top];
		        System.out.println("The element deleted from the stack is: "+tech+"\n");
		        top--;
		        display();
		    }
		}
		**/
		private int maxQsize=100;
		private int front = -1, rear = -1;
		private Object[] que;
		public StackOperations()
		{
			this.que =  new Object[maxQsize];
		}

		public StackOperations(int n)
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
		
		public void showQueue(){
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

	
		
	

//Gabriel Adrian M. Usita 2-ITF

