package demo.launch;

import java.util.Scanner;

public class LaunchArrayTwoDimentional {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ar[][]=new int[3][2];
		for (int i=0;i<ar.length;i++) {
			for (int j=0;j<ar[i].length;j++) {
				System.out.println("Enter marks for: "+j);
				int marks=scan.nextInt();
				ar[i][j]=marks;
			}
		}
		for (int i=0;i<ar.length;i++) {
			for (int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] +" ");
			}
			System.out.println();
		}

	}

}
