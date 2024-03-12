package com.akhil.Algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {15,3,6,1,34,22,19,24,25,25};
		System.out.print("Before Sorting: [");
		for(int num:arr) {
			System.out.print(num+", ");
		}
		System.out.println("]");
		int[] sortedArray = sortingByBubbleSort(arr);
		System.out.print("After  Sorting: [");
		for(int num:sortedArray) {
			System.out.print(num+", ");
		}
		System.out.println("]");
		
	}

	public static int[] sortingByBubbleSort(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			for (int i=0;i<arr.length-j-1;i++) {
				if(arr[i]>arr[i+1]) {
					int num=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=num;
				}
			}
		}
			return arr;
	}
}
