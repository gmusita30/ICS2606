import java.util.Scanner;

import java.util.*;

public class NoelleBatak <T>{

	public static void main(String[] args) {
		int noelle;
		String add;
		Scanner batak = new Scanner(System.in);
		Scanner idol = new Scanner(System.in);
		
		NoelleBatak s = new NoelleBatak();
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
			System.out.println("\nInput Choice" + "\n");
			noelle =batak.nextInt();
			
			if (noelle == 1) {
				System.out.println("New Linked List" +"\n" + "\n");
			}
			
			if (noelle == 2) {
				s.delete(s);
				System.out.println("List cleared"+"\n" + "\n");
			}
			
			
			if (noelle == 3) {
				System.out.println(s.isEmpty() +"\n" + "\n");
			}
			
			if (noelle == 4) {
				
				System.out.println("Enter value to be added in the Linked List: ");
				add	= idol.next();
				s.addtoHead(add);
				System.out.println("\n" + "\n");
				
			
			}
			
			if (noelle == 5) {
				
				System.out.println("Enter value to be added in the Linked List: ");
				add	= idol.next();
				s.addtoTail(add);
				System.out.println("\n" + "\n");
				
			}
			
			if (noelle == 6) {
				
				s.deletefromHead();
				System.out.println("\n" + "\n");
				
			}
			
			if (noelle == 7) {
				
				s.deletefromTail();
				System.out.println("\n" + "\n");
				
			}
			
			
			if (noelle == 8){
				System.out.println(s.find(s) +"\n" + "\n");
			}
			
			if (noelle == 9) {
				s.display();
				System.out.println( "\n" + "\n");			
			}
		}
		while(noelle < 10);
		if (noelle == 10) {
			System.out.println("Goodbye");
		}

	}
	
	public KathIdol<T> head,tail;
	public NoelleBatak()
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
        head = new KathIdol<T>(el,head);
        if (tail == null)
        {
            tail = head; 
        }	
    }
    public void addtoTail(T el)
    {
        if (isEmpty())
        {
		  head = tail = new KathIdol<T>(el); 
        }
        else
        {
		  tail.next = new KathIdol<T>(el); 
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
            KathIdol<T> p;     
            for (p = head; p.next !=tail; p = p.next);
            
				tail = p;                              
				tail.next = null;
			
        }
	   return el;
    }
	
	public KathIdol<T> find(T el){
		KathIdol<T> p=head;
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
		KathIdol<T> pred=head;
		KathIdol<T> t=head.next;
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
        KathIdol node = head;
        for(int i = 0; i <=countNodes(); i++)
        {
            KathIdol temp = head;
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
			KathIdol<T> t=head;
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
		KathIdol<T> temp = head;
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
		KathIdol<T> max=head;
		KathIdol<T> temp=head;
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
		KathIdol<T> occur=head;
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
		KathIdol<T> find=head;
		while(ctr!=Integer.parseInt(el.toString())){
			ctr++;
			find=find.next;
		}
		
		return find.info;
	}
	
	public NoelleBatak<T> linkSelected(NoelleBatak<T> L, NoelleBatak<T> P){
		NoelleBatak<T> output=new NoelleBatak<T>();
		KathIdol<T> LHead=L.head;
		KathIdol<T> PHead=P.head;
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

class KathIdol <T>
{
   public T info;
   public KathIdol<T> next;
   
   public KathIdol(){
       next = null;
   }
   
   public KathIdol(T el)
   {
       info = el;
       next = null;
   }
   
   public KathIdol(T el, KathIdol<T> ptr)
   {
       info = el;
       next = ptr;
   }

   public String toString()
   {
       return info.toString();
   }
}