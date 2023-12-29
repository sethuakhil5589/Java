package demo.launch;

class Aeroplane{
	void fly() {
		System.out.println("Aeroplane is Flying");
	}
	void takingOff() {
		System.out.println("AeroPlane is Taking Off");
	}
}
class Cargoplane extends Aeroplane{
	void load() {
		System.out.println("Cargoplane is Loading");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class Plane extends Aeroplane{
	void refilling() {
		System.out.println("plane is refilling");
	}
	void takingOff() {
		System.out.println("Plane is taking off");
	}
}

public class LaunchInheritance {

	public static void main(String[] args) {
		Aeroplane plane=new Cargoplane();
		plane.fly();
		((Cargoplane) plane).load();
		Plane plane1 = new Plane();
		((Plane) plane1).refilling();
		plane1.fly();
		plane1.takingOff();

	}

}
