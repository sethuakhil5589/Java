package demo.launch;
import java.util.*;

public class LaunchLinkedList {

	public static void main(String[] args) {
		
		/*
		 * LinkedList is a class, which implements List(I) and Dequeue(I)
		 * order ==>  LinkedList --> List(I) --> Dequeue(I)
		 * DataType  Doubly LinkedList
		 * All Implementations= ArrayList+extra Implementations
		 */
		
		LinkedList liList=new LinkedList();
		
		liList.add(100);
		liList.add("Akhil");
		liList.add(50.2);
		liList.add(110.232323);
		liList.add(true);
		liList.add(100);
		System.out.println(liList);
		System.out.println(liList.get(3));
		System.out.println(liList.contains(50.2));
		System.out.println(liList.contains("akhil"));
		System.out.println(liList.hashCode());
		liList.add(3, 120);
		System.out.println(liList);

	}

}
