import java.util.Scanner;
public class TowerofHanoi
{
	static int stepsCounter = -1; 
    public static void shift(int n, String PegA, String PegB, String PegC)
    {
        if (n == 0)
        {
        	stepsCounter ++;
            return;
        }
        shift(n - 1, PegA, PegC, PegB);
        System.out.println("Move disk" + " " + n +" from " + PegA + " to " + PegC);
        shift(n - 1, PegB, PegA, PegC);
        
    }
    public static void main(String[] args)
    {
        System.out.print("Enter number of discs:\n");
        Scanner input = new Scanner(System.in);
        int numberOfDiscs = input.nextInt();
        shift(numberOfDiscs, "Peg 1", "Peg 2", "Peg 3");
        
        System.out.println("\nTotal moves: " + stepsCounter);
        
    }
}