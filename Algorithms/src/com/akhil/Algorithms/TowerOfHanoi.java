package com.akhil.Algorithms;

public abstract class TowerOfHanoi {

	public static void main(String[] args) {
		int numOfHanoi=4;
		System.out.println("Steps for Tower Of Hanoi "+numOfHanoi);
		char source='A';
		char Auxilary='B';
		char Destination='C';
		towerOfHanoi(numOfHanoi, source, Auxilary, Destination);
		
	}
	static void towerOfHanoi(int num, char source, char auxilary, char destination) {
		if(num==1) {
			System.out.println("Disc 1 moves from "+source+" to "+destination);
			return;
		}
		towerOfHanoi(num-1,source,destination,auxilary);
		System.out.println("Disc "+num+" moves from "+source+" to "+destination);
		towerOfHanoi(num-1,auxilary,source,destination);
	}

}
