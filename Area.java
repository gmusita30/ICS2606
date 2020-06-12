import java.util.Scanner;
public class Area {

	double circle , sphere , radius;

	Area(){
		
			System.out.println("Input the radius, lenght, and width to get the area of the circle, sphere, and rectangle." + "\n");
		}
		public void setCircle(double c) 
		{
			this.circle = c;	   
		}
	
		public void getCircle() 
		{
			System.out.println("\n"+"The Area of the Circle is = " + circle);
	
		}
		public void setSphere(double s)
		{
			this.sphere = s;
		}
		public void getSphere() 
		{
			System.out.println("\n"+"The Area of the Sphere is = " + sphere);
	
		}
		public void setRectangle(double r)
		{
			this.radius = r;      
		}
		public void getRectangle() 
		{
			System.out.println("\n"+"The Area of the Rectangle is = " + radius);
	
		}
	
		public static void main(String[] args) {
	
			Area Grande =  new Area(); 
	
			Scanner s = new Scanner(System.in);
	
			System.out.print("Radius is = ");
			double radius = s.nextDouble();
			System.out.print("\n" + "Lenght is = ");
			double length = s.nextDouble();
			System.out.print("\n" + "Width is = ");
			double width = s.nextDouble();
	
			Grande.setCircle(3.14 * (radius * radius));
			Grande.getCircle();
			Grande.setSphere(4* 3.14 * (radius * radius));
			Grande.getSphere();
			Grande.setRectangle(width * length);
			Grande.getRectangle();
	
			s.close();
		}
}
