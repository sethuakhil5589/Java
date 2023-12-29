package demo.launch;

import java.util.Scanner;

class Demo21{
	void def() throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of array");
		int lenghtOfArray=scan.nextInt();
		
		int []array=new int[lenghtOfArray];
		
		System.out.println("Enter place of array");
		int placeOfArray=scan.nextInt();
		
		System.out.println("Enter value of the array to be inserted");
		int valueOfArray=scan.nextInt();
		
		array[placeOfArray]=valueOfArray;
	}
}

class Demo12{
	void abc() throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter numerator and denomirator");
		try {
		int numerator=scan.nextInt();
		int denomirator=scan.nextInt();
		int result=numerator/denomirator;
		
		System.out.println("result: "+result);
		}
		catch(Exception e) {
			System.out.println("In demo class catch block");
			throw e;
		}
		
		finally {
			System.out.println("Thank you for using the application");
		}
		

	}
}

public class LaunchExceptionHandling2 {

	public static void main(String[] args) {
		Demo12 demo=new Demo12();
		
		try {
			demo.abc();
		}
		
		catch(Exception e){
			System.out.println("In main method catch block");
		}
		Demo21 demo2=new Demo21();
		try {
			demo2.def();
		} catch (Exception e) {
			System.out.println("In main method catch block");
		}
		System.out.println("In the last line of main method");
	}

}
