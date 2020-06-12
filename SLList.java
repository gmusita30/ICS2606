import java.util.Scanner;

import java.util.*;

public class SLList <T>{

	public static void main(String[] args) {
		int n;
		String add;
		Scanner s = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		
		SLList sli = new SLList();
		do {
			System.out.println("1. New Stack ");
			System.out.println("2. Clear");
			System.out.println("3. isEmpty");
			System.out.println("4. Add to Head");
			System.out.println("5. Add to Tail");
			System.out.println("6. Delete from Head");
			System.out.println("7. Delete from Tail");
			System.out.println("8. Find");
			System.out.println("9. Display");
			System.out.println("10. Exit");
			System.out.println("\n Input Choice" + "\n");
			n =s.nextInt();
			
			if (n == 1) {
				System.out.println("New Linked List" +"\n" + "\n");
			}
			
			if (n == 2) {
				sli.delete(sli);
				System.out.println("List cleared"+"\n" + "\n");
			}
			
			
			if (n == 3) {
				System.out.println(sli.isEmpty() +"\n" + "\n");
			}
			
			if (n == 4) {
				
				System.out.println("Enter value to be added in the Linked List: ");
				add	= inp.next();
				sli.addtoHead(add);
				System.out.println("\n" + "\n");
				
			
			}
			
			if (n == 5) {
				
				System.out.println("Enter value to be added in the Linked List: ");
				add	= inp.next();
				sli.addtoTail(add);
				System.out.println("\n" + "\n");
				
			}
			
			if (n == 6) {
				
				sli.deletefromHead();
				System.out.println("\n" + "\n");
				
			}
			
			if (n == 7) {
				
				sli.deletefromTail();
				System.out.println("\n" + "\n");
				
			}
			
			
			if (n == 8){
				System.out.println(sli.find(sli) +"\n" + "\n");
			}
			
			if (n == 9) {
				sli.display();
				System.out.println( "\n" + "\n");			
			}
		}
		while(n < 10);
		if (n == 10) {
			System.out.println("Goodbye");
		}

	}
	
	public SNode<T> head,tail;
	public SLList()
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
        head = new SNode<T>(el,head);
        if (tail == null)
        {
            tail = head; 
        }	
    }
    public void addtoTail(T el)
    {
        if (isEmpty())
        {
		  head = tail = new SNode<T>(el); 
        }
        else
        {
		  tail.next = new SNode<T>(el); 
		  tail = tail.next; 
	   }
    }

    // Deletion Operators
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
            SNode<T> p;     
            for (p = head; p.next !=tail; p = p.next);
            
				tail = p;                              
				tail.next = null;
			
        }
	   return el;
    }
	
	public SNode<T> find(T el){
		SNode<T> p=head;
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
		SNode<T> pred=head;
		SNode<T> t=head.next;
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
			//delete(t);
		}
		
		return el;
	}
	
	 // Print Method
    public void display()
    {
        System.out.println("List");
        System.out.print(head.info + " -> ");
        SNode node = head;
        for(int i = 0; i <=countNodes(); i++)
        {
            SNode temp = head;
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
    
    // Count Nodes
    public int countNodes()
    {
		int count=1;
        if(head==null)
        {
            return 0;
        }
        else
        {
			SNode<T> t=head;
          	while(t!=null){
				count++;
				t=t.next;
			}
            return count;
        }
    }
    
    // Replace Method

    public int replaceInfo(T el, T newEl)
    {
		SNode<T> temp = head;
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
		SNode<T> max=head;
		SNode<T> temp=head;
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
		SNode<T> occur=head;
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
		SNode<T> find=head;
		while(ctr!=Integer.parseInt(el.toString())){
			ctr++;
			find=find.next;
		}
		
		return find.info;
	}
	
	public SLList<T> linkSelected(SLList<T> L, SLList<T> P){
		SLList<T> output=new SLList<T>();
		SNode<T> LHead=L.head;
		SNode<T> PHead=P.head;
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

class SNode <T>
{
   public T info;
   public SNode<T> next;
   
   public SNode(){
       next = null;
   }
   
   public SNode(T el)
   {
       info = el;
       next = null;
   }
   
   public SNode(T el, SNode<T> ptr)
   {
       info = el;
       next = ptr;
   }

   public String toString()
   {
       return info.toString();
   }
}