package demo.launch;
import java.util.*;


public class LaunchLamdaExpression4 {

	public static void main(String[] args) {
		List<Integer> arrList=new ArrayList<>();
		
		arrList.add(10);
		arrList.add(34);
		arrList.add(23);
		arrList.add(55);
		arrList.add(60);
		
		System.out.println(arrList);
		
		List<Integer> arrList2= Arrays.asList(20,30,25,35);
		System.out.println(arrList2);
		
		for(int i:arrList) {System.out.print(i + " ");}
		
		
		
		arrList.forEach((i)->System.out.println(i));
		
		

	}

}
