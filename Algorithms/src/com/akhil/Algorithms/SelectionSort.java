package com.akhil.Algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int [] nums= {15,3,6,1,34,19,24,25};
		
		int []sortedNums=sortingBySelectionSort(nums);
		System.out.println();
		for(int num:sortedNums) {
			System.out.print(num+" ");
		}

	}

	public static int[] sortingBySelectionSort(int[] nums) {
		int arrSize=nums.length;
		for(int i=0;i<nums.length;i++) {
			System.out.println();
			int highestValue = 0;
			int a=0;
			for(int j=0;j<arrSize-i;j++) {
				System.out.println(nums[j]+" complete array");
//				System.out.println(nums.length-i-1+" j highest value");
				if(nums[j]>highestValue) {
					System.out.println("Nums[j] : "+nums[j]);
					highestValue=nums[j];
					a=j;
					System.out.println("highest Value: "+highestValue+" j value: "+a);
				}
				
			}
			int temp=nums[nums.length-1-i];
			System.out.println(temp+" temp value");
			nums[nums.length-1-i]=highestValue;
			System.out.println("highest Value at below: "+highestValue);
			System.out.println("Swapping done with last value "+temp+" and highest value "+highestValue);
			nums[a] = temp;
			
		}
		return nums;
	}

	

}
