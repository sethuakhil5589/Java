package demo.launch;

class Aeroplane3{
	void takeoff() {
		System.out.println("Plane is taking off");
	}
	void flying() {
		System.out.println("Plane is flying");
	}
	
}

class CargoPlane3 extends Aeroplane3{
	void takeoff() {
		System.out.println("CargoPlane requires more runway to take off");
	}
	void flying() {
		System.out.println("Cargoplane fly at low altitude");
	}
}

class PassengerPlane3 extends Aeroplane3{
	void takeoff() {
		System.out.println("PassengerPlane requires medium runway to take off");
	}
	void flying() {
		System.out.println("Passengerplane fly at medium altitude");
	}
}

class FighterPlane3 extends Aeroplane3{
	void takeoff() {
		System.out.println("FighterPlane requires less runway to take off");
	}
	void flying() {
		System.out.println("Fighterplane fly at high altitude");
	}
}

class Airport{
	public void permit(Aeroplane3 flight) {
		 
		flight.takeoff();
		flight.flying();
	}
}

public class LaunchPolymorphsim {

	public static void main(String[] args) {
		CargoPlane3 cp=new CargoPlane3();
		
		PassengerPlane3 pp=new PassengerPlane3();
		
		FighterPlane3 fp=new FighterPlane3();
		
		Airport ap=new Airport();
		
		ap.permit(cp);
		System.out.println();
		ap.permit(pp);
		System.out.println();
		ap.permit(fp);
		
//		cp.takeoff();
//		cp.flying();
//		System.out.println();
//		pp.takeoff();
//		pp.flying();
//		System.out.println();
//		fp.takeoff();
//		fp.flying();

	}

}
