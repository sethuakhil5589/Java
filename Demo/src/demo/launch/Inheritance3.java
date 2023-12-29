package demo.launch;

class Human{
	
}
class Student extends Human{
	
}

class Aeroplane1{
	void flying() {
		System.out.println("Aeroplane is flying");
	}
	Human hum=new Human();
	public Human studying() {
		System.out.println("Human is studying");
		return hum;
	}
	
}

class FighterPlane extends Aeroplane1{
	void flying() {
		System.out.println("FighterPlane is flying");
	}
	
	Student std=new Student();
	public Student studying() {
		System.out.println("In student method");
		
		return std;
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		
		Aeroplane1 plane=new FighterPlane();
		plane.flying();
		plane.studying();
		plane.flying();
		plane.studying();
		
		

	}

}
