package com.akhil.Algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {15,3,6,1,34,22,19,24,25,25};
		System.out.print("Before Sorting: [");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println("]");
		int []sortedNums=sortingByInsertionSort(arr);
		System.out.print("After  Sorting: [");
		for(int num:sortedNums) {
			System.out.print(num+" ");
		}
		System.out.println("]");
	}

	public static int[] sortingByInsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1; 
			int temp=arr[i]; 
			
			while(j>=0&&temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		
		return arr;
	}

}
