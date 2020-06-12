import java.util.Scanner;

public class ControlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		   String quit;
		do {
		System.out.println("------->Input your travel time in going to school<-------");
	      Scanner late = new Scanner(System.in);
	      System.out.println("\nHow long does it take going to school from home?(Input in minutes) ");
	      int time = late.nextInt();
	      System.out.println("minutes");
	      System.out.println("\nHow long does it take going home from school?(Input in minutes) ");
	      int times = late.nextInt();
	      System.out.println("minutes");
	      int travel = Math.addExact(time, times);
	      System.out.println("\nAverage: " + travel / 2 + " " + "minutes");
	      minSelection(travel);
	  
	     
	      System.out.println("\nHow long is your fastest travel time going to school?(Input in minutes)");
	      int hr = late.nextInt();
	      System.out.println("minutes");
	      System.out.println("\nWhat is your longest travel time going home from school?(Input in minutes) ");
	      int hrs = late.nextInt();
	      System.out.println("minutes");
	      int fast = Math.addExact(hr, hrs);
	      System.out.println("\nAverage: " + fast / 2 + " " + "minutes");
	      minSelections (fast);
	      
	          
	      
	      System.out.println("\nReversing of time:\n"
	      		+ "Your travel time going to school is " + time + " " + "minutes"+ " and your travel time going home from school is " + times + " " + "minutes");
	      swapFunction (time, times);
	      System.out.println("\nTravel time: ");
	      System.out.println("Fastest travel time going to school is " + hr + " " + "minutes");
	      System.out.println("Fastest travel time going home is " + hrs + " " + "minutes" + "\n");
		
	      System.out.println("Do you want to run the program again? y or n");
	       quit = scan.next();
	       
	      
		}
	     while (quit.equals("y"));
		
			System.out.println("Thank you for answering");
		
	      scan.close();
	     

	   }

	   public static void swapFunction(int wow, int waw)
	   {
	      int tired = wow;
	      wow = waw;
	      waw = tired;
	      System.out.println("After swapping: going home travel time is  " + wow + " " + "minutes" + " and going to school travel time is  " + waw + " " + "minutes");
	      
	   }
	    
	   public static double def(double lower, double upper, double interval){
		  while(lower <= upper){
			  System.out.println(lower);
			  lower += interval;
			}
		  
		  return upper;
		}
	   
	   public static int minSelection(int berilong) 
	   {
		  int beripast = berilong / 2;
	      if (beripast >= 60) 
	      {
	         System.out.println("Your travel time is time consuming");
	      }
	      else
	      {
	         System.out.println("Your travel time is not that time consuming");
	      }
	      return berilong;
	   }

	   public static int minSelections(int hays) 
	   {
	   	  int yoqna = hays / 2;
	      if (yoqna >= 50) 
	      {
	         System.out.println("Your travel time is still long");
	      }
	      else
	      {
	         System.out.println("Your travel time is not that long");
	      }
	      return yoqna;
		

	}

}
