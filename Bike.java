class Mountain
{
	String ride = "for trails, off-roads";
	
		public void model()
		{
			System.out.println("Mountain bike is " + ride);
		}	
		public void display()
		{
			Mountain output = new Mountain();
			output.model();
	}
}

class Road extends Mountain
{
	String ride = "for roads, speed";
	
		public void model()
		{
			System.out.println("Road bike is " + ride);
		}
		
		public void display()
		{
			Road output = new Road();
			super.display();
			output.model();
		}
	
}

class Bike2 extends Road
{
	String ride = "\n-Giant \n-Specialized \n-Bianchi \n-Cannondale \n-Santa Cruz";
	
		public void model()
		{
			System.out.println("\nFamous brands of road bikes and mountain bikes: " + ride);
		}	
		public void display()
		{
			Bike2 output = new Bike2();
			super.display();
			output.model();
		}
}
public class Bike
{	
	public static void main(String[] args) 
	{
		System.out.println("====2 types of a bike and models====\n");
		
	
		Bike2 run = new Bike2();
		run.display();
		
	}
}