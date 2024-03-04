package com.akhil.arrayPrep;

import java.util.Scanner;

public class LaunchArrayTwoDimentionalJagged {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int ar[][]=new int[3][];
		 ar[0]=new int[2];
		 ar[1]=new int[3];
		 ar[2]=new int[5];
		
		
		for (int i=0;i<ar.length;i++) {
			for (int j=0;j<ar[i].length;j++) {
				System.out.println("Enter marks of student of class of: "+i+"  student:"+j);
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
