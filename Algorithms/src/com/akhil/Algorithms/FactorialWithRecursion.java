package com.akhil.Algorithms;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		int num=5;
		System.out.println("Facotial of "+num+ " is: "+factorial(num));
	}
	static int factorial(int num) {
		if(num!=0)
			return num=num*factorial(num-1);
		return 1;
	}

}
