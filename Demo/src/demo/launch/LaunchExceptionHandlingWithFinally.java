package demo.launch;

import java.util.Scanner;

public class LaunchExceptionHandlingWithFinally {

	public static void main(String[] args) {
		int numerator;
		int denomirator;
		int result;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter numerator and denomirator");
		try {
		numerator=scan.nextInt();
		denomirator=scan.nextInt();
		result=numerator/denomirator;
		
		System.out.println("result: "+result);
		
		System.out.println("Enter length of array");
		int lenghtOfArray=scan.nextInt();
		
		int []array=new int[lenghtOfArray];
		
		System.out.println("Enter place of array");
		int placeOfArray=scan.nextInt();
		
		System.out.println("Enter value of the array to be inserted");
		int valueOfArray=scan.nextInt();
		
		array[placeOfArray]=valueOfArray;
		}
		catch(ArithmeticException e){
			System.out.println("Please dont give zero denomirator");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please give value in the bound");
		}
		
		finally {
			System.out.println("Thank you for using the application");
		}
		


	}

}
