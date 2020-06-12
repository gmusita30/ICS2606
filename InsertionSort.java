import java.util.Scanner;
public class InsertionSort{
	

public static void main(String args[]) {
	Scanner sort = new Scanner(System.in);
    System.out.println("How many integers would you like to sort?");
    int num = sort.nextInt();

    System.out.println("Enter the "+ num +" integers");
    int array []= new int[num];
    for(int count = 0;count<num; count++ )
    {
        array[count] = sort.nextInt(); 
    }

    for(int i = 0;i<array.length;i++)
    {
       int key = array[i];
      int j = i-1;
        while(j>=0 && array[j]>key)
        {
            array [j+1] = array[j];
            j=j-1;
        }

        array[j+1] = key;
    }

    System.out.println("Sorted array");

    for(int i=0;i<array.length;i++)

    {
        System.out.println(array[i]);
    }
	
}
}
	