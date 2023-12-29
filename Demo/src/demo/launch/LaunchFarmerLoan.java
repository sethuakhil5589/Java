package demo.launch;

import java.util.Scanner;

class Farmer{
	float pa;
	float tp;
	static float ri;
	float si;
	
	{
		ri=3.0f;
	}
	
	void input(){
		System.out.println("Welcome to Loan App");
		System.out.println("Dear Farmer, Give me the principle amount");
		Scanner scan=new Scanner(System.in);
		pa=scan.nextFloat();
		System.out.println("Time period.?");
		tp=scan.nextFloat();
	}
	void calSimpleIntrest() {
		si=pa*tp*ri/100;
		System.out.println("Simple Intrest: "+si);
	}
	
}

public class LaunchFarmerLoan {

	public static void main(String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		f1.input();
		f1.calSimpleIntrest();
		f2.input();
		f2.calSimpleIntrest();
		f3.input();
		f3.calSimpleIntrest();

	}

}
