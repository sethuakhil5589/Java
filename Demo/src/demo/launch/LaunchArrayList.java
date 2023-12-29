package demo.launch;
import java.util.*;

public class LaunchArrayList {

	/*ArrayList is a class, implements list(I) and extends collection(I).
	 * order =>  ArrayList==>List(I)==>Collection(I).
	 */
	public static void main(String[] args) {
		ArrayList arList=new ArrayList();
		
		arList.add(100);
		arList.add("Akhil");
		arList.add(50.2);
		arList.add(110.232323);
		arList.add(true);
		arList.add(100);
		System.out.println(arList);
		System.out.println(arList.get(3));
		System.out.println(arList.contains(50.2));
		System.out.println(arList.contains("akhil"));
		System.out.println(arList.hashCode());
	

	}

}
