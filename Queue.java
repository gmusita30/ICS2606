import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue
{
    public static void main(String[] args)
    {
    	int choice;
        Scanner scan = new Scanner(System.in);
 
        System.out.println("====>Q U E U E<====\n");
        System.out.println("How many nodes do you want to Queue? ");
        int node = scan.nextInt();
        
        QueueT queue = new QueueT(node);        
               
        char cont;
        do{
            System.out.println(" ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEMPTY");
            System.out.println("5. isFULL");
            System.out.println("6. Exit");
            
            choice = scan.nextInt();
            
            switch (choice){
            
            case 1 : 
                System.out.println("Enter integer element to insert");
                try
                {
                    queue.enqueue( scan.nextInt() );
                }
                catch(Exception error)
                {
                    System.out.println("Error : " +error.getMessage());
                }                         
                break;                         
            
            case 2 : 
                try
                {
                    System.out.println("Removed Element = "+queue.dequeue());
                }
                catch(Exception error)
                {
                    System.out.println("Error : " +error.getMessage());
                }
                break;                         
            
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+queue.peek());
                }
                catch(Exception error)
                {
                    System.out.println("Error : "+error.getMessage());
                }
                break;                            
           
            case 4 : 
                System.out.println("Empty status = "+queue.isEmpty());
                break;                
           
            case 5 : 
                System.out.println("Full status = "+queue.isFull());
                break;  
            
            case 6:
            	System.out.print("Thank you and Goodbye!");
	        	System.exit(0);
                 break;

           
            }
            queue.display();  
            
        }while (choice != 0);
    }    
    
}
	class QueueT
	{
		    int Queue[] ;
		    int front, rear, size, len;
		 
		   
		    public QueueT(int n) 
		    {
		        size = n;
		        len = 0;
		        Queue = new int[size];
		        front = -1;
		        rear = -1;
		    }    
		 
		    public boolean isEmpty() 
		    {
		        return front == -1;
		    }    
		   
		    public boolean isFull() 
		    {
		        return front==0 && rear == size -1 ;
		    }    
		   
		    public int peek() 
		    {
		        if (isEmpty())
		           throw new NoSuchElementException("Underflow Exception");
		        return Queue[front];
		    }    
		   
		    public void enqueue(int i) 
		    {
		        if (rear == -1) 
		        {
		            front = 0;
		            rear = 0;
		            Queue[rear] = i;
		        }
		        else if (rear + 1 >= size)
		            throw new IndexOutOfBoundsException("Overflow Exception");
		        else if ( rear + 1 < size)
		            Queue[++rear] = i;    
		        len++ ;    
		    }    
		   
		    public int dequeue() 
		    {
		        if (isEmpty())
		           throw new NoSuchElementException("Underflow Exception");
		        else 
		        {
		            len-- ;
		            int ele = Queue[front];
		            if ( front == rear) 
		            {
		                front = -1;
		                rear = -1;
		            }
		            else
		                front++;                
		            return ele;
		        }        
		    }
		    
		    public void display()
		    {
		        System.out.print("\nQueue = ");
		        if (len == 0)
		        {
		            System.out.print("Empty\n");
		            return ;
		        }
		        for (int i = front; i <= rear; i++)
		            System.out.print(Queue[i]+" ");
		        System.out.println();        
	    }
	}
//Gabriel Adrian M. Usita 2-ITF