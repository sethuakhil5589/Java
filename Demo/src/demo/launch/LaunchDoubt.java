package demo.launch;

import java.util.Scanner;

public class LaunchDoubt {

	public static void main(String[] args) {
		String option1;
		String option2;
		String answer;

		option1="Hello";
		option2="hai";
		System.out.println("Choose one option");
		Scanner scan=new Scanner(System.in);
		answer = scan.nextLine();
		
		System.out.println(option1);
		if(answer==option1) {
			System.out.println("option1");
		}
		else if(answer==option2) {
			System.out.println("option2");
		}
		else {
			System.out.println("came to loop");
		}
	

	}

}
