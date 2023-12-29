package demo.launch;

import java.util.Scanner;

class Guesser{
	Scanner scan= new Scanner(System.in);
	int guessNumber() {
		System.out.println("Guesser! Please Guess the number");
		int guesserNum=scan.nextInt();
		return guesserNum;
		}
}

class Player{
	Scanner scan= new Scanner(System.in);
	int guessNumber() {
		System.out.println("Player! Please Guess the number");
		int playerNum=scan.nextInt();
		return playerNum;
		}
}

class Umpire{
	int guesserNumber, p1, p2, p3;
	void gettingGuesserNumber() {
		Guesser guess= new Guesser();
		guesserNumber=guess.guessNumber();
	}
	void gettingPlayerNumber() {
		Player player=new Player();
		
		p1=player.guessNumber();
		p2=player.guessNumber();
		p3=player.guessNumber();
		
	}
	void compare() {
		if(p1==guesserNumber) {
			if (p1==p2 && p2==p3) {
				System.out.println("Game tied");
			}
			else if (p1==p3) {
				System.out.println("P1 and P3 are winners");
			}
			else if(p1==p2 ) {
				System.out.println("P1 and P2 are winners");
			}
			else {
				System.out.println("P1 is the winner");
			}
		}
		else if(p2==guesserNumber) {
			if(p2==p3) {
				System.out.println("P2 and P3 are Winners");
			}
			else {
				System.out.println("P2 is the winner");
			}
		}
		else if (p3==guesserNumber){
			System.out.println("P3 is the winner");
		}
		else {
			System.out.println("No one is the Winner");
		}
	}
}


public class LaunchGame {

	public static void main(String[] args) {
		Umpire ump=new Umpire();
		ump.gettingGuesserNumber();
		ump.gettingPlayerNumber();
		ump.compare();

	}

}
