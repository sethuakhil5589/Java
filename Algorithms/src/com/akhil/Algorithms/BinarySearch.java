package com.akhil.Algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {3,5,9,12,14,15,16};
		System.out.println("array length: "+arr.length);
		int ans=searchByBinarySearch(arr,3);
		System.out.println(ans);
		if(ans!=-1) 
			System.out.println("Success");
		else if (ans==-1) {
			System.out.println("Failed");
		}
		else
			System.out.println("something wrong");	
	}
	
	static int searchByBinarySearch(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		System.out.println("In Binary Search");
		System.out.println(start+" : "+end);
		
		while(start<=end) {
			int middle=(start+end)/2;
			if(target>arr[middle]) {
				start=middle+1;
			}
			else if(target<arr[middle]){
				end=middle-1;
			}
			else {
				System.out.println("Element found");
				return 1;
			}
			
		}
		return -1;
	}

}
