import java.util.Scanner;
public class StudentProfile 
{
	int studentnumber, studentage;
	String studentname, birthdate, gender, religion, address, status, nationality, section, mobilenumber;
	
	public void setName(String name) {
		studentname = name;
	}
		
	public String getName() {
		System.out.println("Name: " + studentname);
		return studentname;
	}
	
	public void setAge( int age) {
		studentage = age;
		
	}
	
	public int getAge( ) {
		System.out.println("Age: "+ studentage);
		return studentage;
		
	}
	
	public void setId( int id) {
		studentnumber = id;
		
	}
	
	public int getId( ) {
		System.out.println("Student Number: " + studentnumber);
		return studentnumber;
		
	}
	
	public void setCell( String cell) {
		mobilenumber = cell;
		
	}
	
	public String getCell( ) {
		System.out.println("Mobile Number: " + mobilenumber);
		return mobilenumber;
		
	}
	
	public void setBday( String bday) {
		birthdate = bday;
		
	}
	
	public String getBday() {
		System.out.println("Birhtdate: " + birthdate );
		return birthdate;
		
	}
	
	public void setSex( String sex) {
		gender = sex;
		
	}
	
	public String getSex() {
		System.out.println("Gender: " + gender );
		return gender;
	
		
	}
	
	public void setJesus( String jesus) {
		religion = jesus;
		
	}
	
	public String getJesus() {
		System.out.println("Religion: " + religion );
		return religion;
	
		
	}
	
	public void setHome( String home) {
		address = home;
		
	}
	
	public String getHome() {
		System.out.println("Address: " + address );
		return address;
	
		
	}
	
	public void setFb( String fb) {
		status = fb;
		
	}
	
	public String getFb() {
		System.out.println("Status: " + status );
		return status;
	
		
	}
	
	public void setPinoy( String pinoy) {
		nationality = pinoy;
		
	}
	
	public String getPinoy() {
		System.out.println("Nationality: " + nationality );
		return nationality;
	
		
	}
	
	public void setBlock( String block) {
		section = block;
		
	}
	
	public String getBlock() {
		System.out.println("Section: " + section );
		return section;
	
		
	}
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your student number?");
		String a = input.nextLine();
		System.out.println("What is your surname? ");
		String b = input.nextLine();
		System.out.println("What is your first name?");
		String c = input.nextLine();
		System.out.println("What is your middle name?");
		String d = input.nextLine();
		System.out.println("What is your age?");
		String e = input.nextLine();
		System.out.println("When is your birthday?");
		String f = input.nextLine();
		System.out.println("What is your gender?");
		String g = input.nextLine();
		System.out.println("What is your religion?");
		String h = input.nextLine();
		System.out.println("What is your address?");
		String i = input.nextLine();
		System.out.println("What is your status?");
		String j = input.nextLine();
		System.out.println("What is your nationality?");
		String k = input.nextLine();
		System.out.println("What is your section/program?");
		String l = input.nextLine();
		System.out.println("What is your mobile number?");
		String m = input.nextLine();
		
		input.close();
	
		System.out.println(" \n\t Student Profile");
		StudentProfile myProfile = new StudentProfile();
		myProfile.setName(b + " " + c + " " + d);
		myProfile.setAge(Integer.parseInt(e));
		myProfile.setId(Integer.parseInt(a));
		myProfile.setCell(m);
		myProfile.setBday(f);
		myProfile.setSex(g);
		myProfile.setJesus(h);
		myProfile.setHome(i);
		myProfile.setFb(j);
		myProfile.setPinoy(k);
		myProfile.setBlock(l);
		myProfile.getName();
		myProfile.getAge();
		myProfile.getId();
		myProfile.getCell();
		myProfile.getBday();
		myProfile.getSex();
		myProfile.getJesus();
		myProfile.getHome();
		myProfile.getFb();
		myProfile.getPinoy();
		myProfile.getBlock();
	}
		

}
