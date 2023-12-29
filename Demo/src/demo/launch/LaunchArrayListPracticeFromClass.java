package demo.launch;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class LaunchArrayListPracticeFromClass {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(2,3,4,7,8,35,67);//2 4 8 //4 8 16 
		
//		Consumer<Integer> cons =((i)-> {
//			if(i/2==0) {
//				i=2*i;
//			}
//			int j=0;
//			j=j+i;
//		});
		System.out.println("using for each loop");
		int sum=0;
		for(Integer num: nums) {
			if(num%2==0) {
				num=num*2;
				sum=num+sum;
			}
		}
		System.out.println("sum : "+sum);
		
		//******************************************************************************
		
		nums.forEach((i)-> {
			int j;
			if(i%2==0) {
				i=2*i;
				j=i;
			}
			else {
				System.out.println(i+" value is odd");
			}
			j=i;
			
			System.out.println("j :"+j);
		});
		
		//*****************************************************************************
		
		System.out.println("**************************");
		Iterator<Integer> itr=nums.iterator();
		int b=0;
		while(itr.hasNext()) {
			int a=itr.next();
			if(a%2==0) {
				a=2*a;
				System.out.println("a "+a);
			}
			
			System.out.println("b-"+b);
		}
		
		
		

	}
	
	


}
