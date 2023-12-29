package demo.launch;
import java.util.*;

public class LaunchIterator {

	public static void main(String[] args) {
		ArrayList arr1List=new ArrayList();
		arr1List.add(100);    
		arr1List.add(50);
		arr1List.add(55);
		arr1List.add(25);
		arr1List.add(5);
		
		
		Iterator itr= arr1List.iterator();
		
		
//		for (int i=0;i<arr1List.size();i++) {
//			System.out.println(itr.next());
//		}
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("**************************************");
		
		ListIterator litr=arr1List.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		ListIterator litr2=arr1List.listIterator(arr1List.size());
		
		while(litr2.hasPrevious()) {
			System.out.println(litr2.previous());
		}

	}

}
