package com.akhil.Algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {15,3,6,1,34,22,19,24,25,25};
		System.out.print("Before Sorting: [");
		for(int num:arr) {
			System.out.print(num+", ");
		}
		
		int [] sortedArr=quickSort(arr,0,arr.length-1);
		System.out.print("After  Sorting: [");
		for(int num:sortedArr) {
			System.out.print(num+", ");
		}
		System.out.println("]");

	}

	public static int[] quickSort(int[] arr, int low, int high) {
		if(low<high) {
			
			int po=portion(arr,low,high);
			quickSort(arr, low, po-1);
			quickSort(arr, po+1, high);
		}
		
		return arr;
	}

	public static int portion(int[] arr, int low, int high) {
		int i=low-1;
		int pi=arr[high];
		for(int j=low;j<high;j++) {
			if(pi>arr[j]) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			int temp=arr[high];
			arr[high]=arr[i+1];
			arr[i+1]=temp;
		}
		return i+1;
	}

}
