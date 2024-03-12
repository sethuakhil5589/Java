package com.akhil.Algorithms;

public class BinarySearchWithRecursiveFunction {

	public static void main(String[] args) {
		int []arr= {1,3,5,6,8,9,12,14,16,20};
		int start=0;
		int end=arr.length-1;
		int target=14;
		
		int result=searchingNumberByBinarySearch(arr,start, end, target);
		
		if(result==1) {
			System.out.println("Target Found");
		}
		else {
			System.out.println("Target didn't found");
		}

	}

	public static int searchingNumberByBinarySearch(int[] arr, int start, int end, int target) {
		while(start<=end) {
			int middle=(start+end)/2;
			if(target==arr[middle]) {
				return 1;
			}
			else if(target>arr[middle]) {
				return searchingNumberByBinarySearch(arr, middle+1, end, target);
			}
			else {
				return searchingNumberByBinarySearch(arr, start, middle-1, target);
			}
		}
		return 0;
	}

	

}
