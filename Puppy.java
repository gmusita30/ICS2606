import java.util.Scanner;
public class Puppy {
	
	Scanner input = new Scanner(System.in);
	
	int puppyAge;
	String ownersName;
	String ownersAddress;
	String PuppyName;
	
	public void setName(String name) {
		PuppyName = name;
		
		
	}
	
	public String getName() {
		System.out.println("The name of your puppy is: " + PuppyName);
		return PuppyName;
	}
	

	public void setAge( int age) {
		puppyAge = age;
		
	}
	
	public int getAge( ) {
		System.out.println("Puppy's age is: "+ puppyAge);
		return puppyAge;
		
	}
	
	public void setownersName( String name) {
		ownersName = name;
				
	}
	
	public String getownersName() {
		System.out.println("Owners name is: " + ownersName);
		return ownersName;
		
	
	}
	public void setownersAddress( String address) {
		ownersAddress = address;
		
	}
	
	public String getownersAddress() {
		System.out.println("Owners address is:" + ownersAddress );
		return ownersAddress;
	
		
	}

	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		
		System.out.println("What is your dog's name?");
		String a = z.nextLine();
		System.out.println("How old is it? ");
		String b = z.nextLine();
		System.out.println("What is your name?");
		String c = z.nextLine();
		System.out.println("Where do you live?");
		String d = z.nextLine();
		
		z.close();
		
		System.out.println();
		Puppy ugh = new Puppy();
		ugh.setName(a);
		ugh.setAge(Integer.parseInt(b));
		ugh.setownersName(c);
		ugh.setownersAddress(d);
		ugh.getName();
		ugh.getAge();
		ugh.getownersName();
		ugh.getownersAddress();
		
		
	}
	
}

