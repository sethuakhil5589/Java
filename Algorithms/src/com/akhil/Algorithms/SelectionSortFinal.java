package com.akhil.Algorithms;

public class SelectionSortFinal {

	public static void main(String[] args) {
		int [] nums= {15,3,6,1,34,19,24,25,25};
		System.out.print("Before Sorting: [");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		System.out.println("]");
		
		int []sortedNums=sortingBySelectionSort(nums);
		System.out.print("After  Sorting: [");
		for(int num:sortedNums) {
			System.out.print(num+" ");
		}
		System.out.println("]");
	}

	public static int[] sortingBySelectionSort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int highestValue = 0;
			int a=0;
			for(int j=0;j<nums.length-i;j++) {
				if(nums[j]>highestValue) {
					highestValue=nums[j];
					a=j;
				}
			}
			int temp=nums[nums.length-1-i];
			nums[nums.length-1-i]=highestValue;
			nums[a] = temp;
		}
		return nums;
	}

}
