package demo.launch;

import java.util.Scanner;

public class LaunchArrayOneDimentional {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int []arr=new int[5];
		for (int i=0;i<arr.length;i++) {
			System.out.println("Add marks of student: "+ i);
			int marks=scan.nextInt();
			arr[i]=marks;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] +" ");
		}
		System.out.println();

	}

}
