package demo.launch;

class Guesser1 {
	void guesser() {
		System.out.println("In Guesser");
	}

}

class Umpire1{
	void umpire() {
		System.out.println("In Umpire");
		Player1 play1= new Player1();
		int num1=play1.player();
		System.out.println(num1);
	}
	
}

class Player1{
	int player() {
		
		System.out.println("In player");
		return 1;
	}
}
public class LaunchSample {

	public static void main(String[] args) {
		Guesser1 guess= new Guesser1();
		Umpire1 ump= new Umpire1();
		Player1 play=new Player1();
		ump.umpire();
		guess.guesser();
		play.player();
	}

}
