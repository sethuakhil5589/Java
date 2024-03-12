package com.akhil.Algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,15,23,26,2,24,23};
		
		int ans=searchingThroughLinearSearch(arr,23);
		
		if(ans==0) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Success");
		}

	}
	
	static int searchingThroughLinearSearch(int[] arr,int num) {
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Element found at: "+i);
				a++;
				
			}
			
		}
		return a;
		
	}
	

}
