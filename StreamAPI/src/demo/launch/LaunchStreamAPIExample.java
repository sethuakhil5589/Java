package demo.launch;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LaunchStreamAPIExample {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Akhil","Sethu","Susmitha","Harshith","Vijay");
		
//		Stream<Object> s=names.parallelStream().filter(a -> a.equalsIgnoreCase("v")).map(a -> a.length());
//		
//		Object noOfLetters= s.reduce(0,(c,e)->);

		Optional<String> name=names.parallelStream().filter(a -> a.contains("s")).findFirst();
		
		System.out.println(name.get());
		
		List<String> uNames= names.parallelStream().map(a->a.toUpperCase()).toList();
		
		System.out.println(uNames);
		
		Integer num=new Integer(14);
	}

}
