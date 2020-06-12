
import java.util.Scanner;

public class QueueOperations<Queue>{

	public static void main(String args[]) {

		int num; 
		int bque;
		Scanner scan = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		QueueOperations que = new QueueOperations();
		do {
			System.out.println("----QUEUE MENU----\n");
			System.out.println("1. New");
			System.out.println("2. Clear");
			System.out.println("3. isFULL");
			System.out.println("4. isEMPTY");
			System.out.println("5. Enqueue");
			System.out.println("6. Dequeue");
			System.out.println("7. Peek");
			System.out.println("8. Display");
			System.out.println("9. Exit");
			System.out.println("\nChoice to Input" + "\n");
			num =scan.nextInt();
			
			if (num == 1) {
				System.out.println("New Queue" +"\n" + "\n");
			}
			
			if (num == 2) {
				que.clear();
			}
			
			if (num == 3) {
				System.out.println(que.isFull() +"\n" + "\n");
			}
			
			if (num == 4) {
				System.out.println(que.isEmpty() +"\n" + "\n");
			}
			
			if (num == 5) {
				if (que.isFull()) {
					System.out.println("Stack is Full" +"\n" +"\n");
				}
				else {
					System.out.println("Enter value to be added in stack: ");
				bque = input.nextInt();
				que.enqueue(bque);
				}
			}
			
			if (num == 6) {
				System.out.println(que.dequeue() +"\n" + "\n");
			}
			
			if (num == 7) {
				System.out.println(que.peek() +"\n" + "\n");
			}
			
			if (num == 8 ){
				que.showQueue();
			}
			
		}
		while(num < 9);
		
			if (num == 9) {
				System.out.println("Goodbye");
		}
	}
	
	private int maxQsize=100;
	private int front = -1, rear = -1;
	private Object[] quek2;
	public QueueOperations()
	{
		quek2 =  new Object[maxQsize];
	}

	public QueueOperations(int n)
	{
		if(n  > 0) 
			maxQsize = n;
		quek2 = new Object[maxQsize];
	}

	public void clear()
	{
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty()
	{
		return(front == -1);
	}

	public boolean isFull()
	{
		return((rear+1) % maxQsize == front);
	}

	public Queue enqueue(Queue el)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			return null;
		}
		if(isEmpty())
		{
			front = 0;
		}
		rear = (rear + 1) % maxQsize;
		quek2[rear] = el;
		return el;
	}

	public Queue dequeue()
	{
		if(isEmpty())
		{
			return null;
		}
		Queue el = (Queue) quek2[front];
		if(front == rear)
		{
			clear();
		}
		else
		{
			this.front = (front + 1) % maxQsize;
		}
		return el;
	}

	public Queue peek()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			return (Queue) quek2[front]; 
		}
	}
	
	public void showQueue(){
		int x=front;
		
		if(isEmpty()){
			System.out.println("null");
		}
		
		else if(front==rear){
			System.out.print(quek2[x]);
		}
		
		else{
			do{
				if(quek2[x]!=null){
					System.out.print(quek2[x]+",");
					x=(x+1)%maxQsize;
				}
			}while(x!=rear);
			System.out.print(quek2[rear]);
		}
			
	}
	
		
}
