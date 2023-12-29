package demo.launch;

interface Mobile{
	void calling();
	void texting();
}

interface Laptop{
	void learnJava();
}

class CellPhone{
	Mobile mobile=new Mobile() {
		public void calling() {
			System.out.println("Called");
		}
		public void texting() {
			System.out.println("Texted");
		}
	};
	
}

class Lappy{
	Laptop lap=() -> {
		System.out.println("Learn java");
	}
	;
}
public class LaunchMobile {

	public static void main(String[] args) {
		
		CellPhone cell = new CellPhone();
		cell.mobile.calling();
		cell.mobile.texting();
		Lappy laptop = new Lappy();
		laptop.lap.learnJava();;

	}

}
