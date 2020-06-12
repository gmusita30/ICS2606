
public class SomthingIsWrong {
	
	double width, height;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SomthingIsWrong myRect = new SomthingIsWrong();
			
			myRect.width = 40;
			myRect.height = 50;
		
			System.out.println("myRect's area is " + myRect.area());
		}
		
		public double area() {
			double area;
			area = width * height;
			
			return area;


	}

}
