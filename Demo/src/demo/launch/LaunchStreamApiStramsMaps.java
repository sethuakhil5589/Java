package demo.launch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStreamApiStramsMaps {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(2,25,32,11,8,46); // 2 32 8 46 // 4 64 16 92
		
		Stream<Integer> s1=nums.stream();
		Stream<Integer> s2=s1.filter(i -> i%2==0);
		s2.forEach(i-> System.out.print(i + " "));
		System.out.println();
		
		
		
//		Stream<Integer> s3=s2.map(i -> 2*i);
		
//		Stream<Integer> s4=s3.map((Integer i, Integer sum=0)-> sum=sum+i);
		
//		BinaryOperator<Integer> bi=new BinaryOperator<Integer>() { (Integer c, Integer e)-> {
//			return c+e;
//		}
//		};
		
		
		
		Stream<Integer> s=nums.stream()
				.filter(i->i%2==0)
				.map(i -> 2*i);
		
		
//		s.forEach(i-> System.out.println(i));
		
		Integer sum=s.reduce(0,((c,e)->c+e));
		
		System.out.println("sum: "+sum);

	}

}
