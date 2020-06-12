import java.util.Scanner;
import java.util.*;

public class SLinkList <T>{

	public static void main(String[] args) {
		int num;
		String addelete;
		Scanner singly = new Scanner(System.in);
		Scanner link = new Scanner(System.in);
		
		
		
		SLinkList list = new SLinkList();
		do {
			System.out.println("====Singly Linked List Menu====\n ");
			System.out.println("1. New");
			System.out.println("2. Delete");
			System.out.println("3. isEmpty");
			System.out.println("4. Add to Head");
			System.out.println("5. Add to Tail");
			System.out.println("6. Delete from Head");
			System.out.println("7. Delete from Tail");
			System.out.println("8. Find");
			System.out.println("9. Display");
			System.out.println("10. Exit");
			System.out.println("\nChoice to Input" + "\n");
			num =singly.nextInt();
			
			if (num == 1) {
				System.out.println("New Linked List" +"\n" + "\n");
				int node = singly.nextInt();
			}
			
			if (num == 2) {
				list.delete(list);
				System.out.println("List cleared"+"\n" + "\n");
			}
			
			
			if (num == 3) {
				System.out.println(list.isEmpty() +"\n" + "\n");
			}
			
			if (num == 4) {
				
				System.out.println("Enter value to be added in the Linked List: ");
				addelete	= link.next();
				list.addtoHead(addelete);
				System.out.println("\n" + "\n");
				
			
			}
			
			if (num == 5) {
				
				System.out.println("Enter value to be added in the Linked List: ");
				addelete	= link.next();
				list.addtoTail(addelete);
				System.out.println("\n" + "\n");
				
			}
			
			if (num == 6) {
				
				list.deletefromHead();
				System.out.println("\n" + "\n");
				
			}
			
			if (num == 7) {
				
				list.deletefromTail();
				System.out.println("\n" + "\n");
				
			}
			
			
			if (num == 8){
				System.out.println(list.find(list) +"\n" + "\n");
			}
			
			if (num == 9) {
				list.display();
				System.out.println( "\n" + "\n");			
			}
		}
		while(num < 10);
		if (num == 10) {
			System.out.println("Goodbye and Thank you!");
		}

	}
	
class Nodes <T>
	{
	   public T info;
	   public Nodes<T> next;
	   
	   public Nodes(){
	       next = null;
	   }
	   
	   public Nodes(T el)
	   {
	       info = el;
	       next = null;
	   }
	   
	   public Nodes(T el, Nodes<T> ptr)
	   {
	       info = el;
	       next = ptr;
	   }

	   public String toString()
	   {
	       return info.toString();
	   }
	}

	
	public Nodes<T> head,tail;
	public SLinkList()
    {
        head = tail = null;
    }
    
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    // Addition operators
    public void addtoHead(T el)
    {
        head = new Nodes<T>(el,head);
        if (tail == null)
        {
            tail = head; 
        }	
    }
    public void addtoTail(T el)
    {
        if (isEmpty())
        {
		  head = tail = new Nodes<T>(el); 
        }
        else
        {
		  tail.next = new Nodes<T>(el); 
		  tail = tail.next; 
	   }
    }

    
    public T deletefromHead()
    {
        if (isEmpty()) 
        {
            return null;
        }      
        T el = head.info;
        
        if (head == tail)
        {                              
            head = tail = null;
        }
        else
        {
            head = head.next;
        }                                           
        return el; 
    }
    public T deletefromTail()
    {
        if (isEmpty())  return null;
	   T el = tail.info;
	   if (head == tail)
       {              
            head = tail = null;
        }
        else
        {
            Nodes<T> p;     
            for (p = head; p.next !=tail; p = p.next);
            
				tail = p;                              
				tail.next = null;
			
        }
	   return el;
    }
	
	public Nodes<T> find(T el){
		Nodes<T> p=head;
		while(p!=null&&p.info!=el){
			p=p.next;
		}
		
		return head;
	}
	
	public T delete(T el){
		if(isEmpty()){
			System.out.println("List Empty");
			return el;
		}
		else if(el==tail.info){
			return deletefromTail();
		}
		else if(el==head.info){
			return deletefromHead();
		}
		Nodes<T> pred=head;
		Nodes<T> t=head.next;
		while(t!=null&&t.info!=el){
			pred=pred.next;
			t=t.next;
		}
		if(t==null){
			System.out.println("List Empty");
			return el;
		}
		else{
			pred.next=t.next;
			
		}
		
		return el;
	}
	
	 
    public void display()
    {
        System.out.println("List");
        System.out.print(head.info + " -> ");
        Nodes node = head;
        for(int i = 0; i <=countNodes(); i++)
        {
            Nodes temp = head;
            head = head.next;
            System.out.print(head);
            if(head != null)
            {
                System.out.print(" -> ");
            }
        }
        head = node;
        System.out.println();
    }
    
    
    public int countNodes()
    {
		int count=1;
        if(head==null)
        {
            return 0;
        }
        else
        {
			Nodes<T> t=head;
          	while(t!=null){
				count++;
				t=t.next;
			}
            return count;
        }
    }
    
    

    public int replaceInfo(T el, T newEl)
    {
		Nodes<T> temp = head;
        while(head.info != el)
        {
            head = head.next;
        }
        if(head.info==el)
        {
            head.info=newEl;
            head=temp;
        }
        return 1;
    }
	
	public int maxInfo(){
		Nodes<T> max=head;
		Nodes<T> temp=head;
		while(temp!=null){
			if(Integer.parseInt(max.toString())>Integer.parseInt(temp.toString())){
				temp=temp.next;
			}
			else{
				max=temp;
				temp=temp.next;
			}
		}

		return Integer.parseInt(max.toString());
	}
	
	public int countOccurence(T el){
		int ctr=0;
		Nodes<T> occur=head;
		while(occur!=null){
			if(el==occur.info){
				ctr++;
				occur=occur.next;
			}
			else{
				occur=occur.next;
			}
		}
		return ctr;
	}
	
	public T findNode(T el){
		int ctr=0;
		Nodes<T> find=head;
		while(ctr!=Integer.parseInt(el.toString())){
			ctr++;
			find=find.next;
		}
		
		return find.info;
	}
	
	public SLinkList<T> linkSelected(SLinkList<T> L, SLinkList<T> P){
		SLinkList<T> output=new SLinkList<T>();
		Nodes<T> LHead=L.head;
		Nodes<T> PHead=P.head;
		while(!P.isEmpty()){
			int ctr=1;
			T el=LHead.info;
			while(ctr!=Integer.parseInt(P.head.toString())){
				ctr++;
				el=LHead.info;
				LHead=LHead.next;
			}
			output.addtoTail(el);
			P.deletefromHead();
		}
		
		return output;
	}

}

//Gabriel Adrian M. Usita 2-ITF