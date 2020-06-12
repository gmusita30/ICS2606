
class Honda{
	String car = "for trails, off-roads";
	//int area = 510000000;
	
	public void model(){
		System.out.println("Mountain bike is  " + car);
	}
	/**
	public void area(){
		System.out.println("yes: " + area + "asd");
	}
	**/
	public void display(){
		Honda output = new Honda();
		output.model();
		//output.area();
	}
}

class  Japan extends Honda{
	String car = "for roads, speed";
	//int area = 44580000;
	
	public void model(){
		System.out.println("Mountain bike is " + car);
	}
	/**
	public void area(){
		System.out.println("Asia's Area: " + area + " sqaure km");
	}
	**/
	public void display(){ 
		Japan output = new Japan();
		super.display();
		output.model();
		//output.area();
	}
	
}

class Philippine extends Japan{
	String car = "\n-Giant \n-Specialized \n-Scott \n-Cannondale \n-Santa Cruz";
	//int area = 300000;
	
	public void model(){
		System.out.println("\nFamous brands of road bikes and mountain bikes: " + car);
	}
	/**
	public void area(){
		System.out.println("Philippines' Area: " + area + "square km");
	}
	**/
	public void display(){
		Philippine output = new Philippine();
		super.display();
		output.model();
		//output.area();
	}
	public static void main(String args[]){
		
		System.out.println("====2 types of a bike and models====\n");
		Philippine stat = new Philippine();
		stat.display();
	}
}
