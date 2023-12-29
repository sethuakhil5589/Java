package demo.launch;
import java.util.*;
import java.util.concurrent.*;

public class LaunchConcuurentModification {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList list=new CopyOnWriteArrayList();
		list.add(100);
		list.add(200);
		list.add(25);
		list.add(150);
		list.add(135);
		
		Iterator itr=list.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			list.add(45);
		}
		System.out.println(list);
		

	}

}
