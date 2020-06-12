class Earth{
	String population = "7530000000";
	int area = 510000000;
	
	public void population(){
		System.out.println("Earth's Population: " + population);
	}
	public void area(){
		System.out.println("Earth's Area: " + area + "square km");
	}
	public void display(){
		Earth output = new Earth();
		output.population();
		output.area();
	}
}

class  Asia extends Earth{
	String population = "4463000000";
	int area = 44580000;
	
	public void population(){
		System.out.println("Asia's Population: " + population);
	}
	public void area(){
		System.out.println("Asia's Area: " + area + " sqaure km");
	}
	public void display(){
		Asia output = new Asia();
		super.display();
		output.population();
		output.area();
	}
	
}

class Philippines extends Asia{
	String population = "105000000";
	int area = 300000;
	
	public void population(){
		System.out.println("Philippines' Population: " + population);
	}
	public void area(){
		System.out.println("Philippines' Area: " + area + "square km");
	}
	public void display(){
		Philippines output = new Philippines();
		super.display();
		output.population();
		output.area();
	}
	public static void main(String args[]){
		Philippines stat = new Philippines();
		stat.display();
	}
}