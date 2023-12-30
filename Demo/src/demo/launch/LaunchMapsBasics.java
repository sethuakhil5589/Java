package demo.launch;
import java.util.*;
import java.util.Map.Entry;


public class LaunchMapsBasics {

	public static void main(String[] args) {
		
		HashMap cricters=new HashMap();
		
		cricters.put(1, "Virat kohli");
		
		cricters.put(2, "Suresh Raina");
		
		cricters.put(3, "Smith");
		
		System.out.println(cricters);
		
		/*
		 * We have different types of collections.
		 * HashMap, LinkedHashMap, TreeMap, HashTable
		 * For comparisons refer notes
		 */
		
		HashMap<Integer, String> roomMates=new HashMap<>();
		
		roomMates.put(1, "Sethu Akhil");
		roomMates.put(2, "Susmitha");
		roomMates.put(3, "Harshith");
		roomMates.put(4, "Vijay");
		roomMates.put(5, "Prathusya");
		roomMates.put(6, "Vaishnavi");
		
		System.out.println("*********************************");
		System.out.println();
		//getting only keys for the above data.
		
		Set<Integer> keysOfRoomMates=roomMates.keySet();
		
		Iterator<Integer> itr1=keysOfRoomMates.iterator();
		
		while(itr1.hasNext()) {
			System.out.println("Keys are : "+itr1.next());
		}
		
		//roomMates.keySet().iterator().next()
		
		//getting or accessing only values for the above data.
		
		Collection<String> valuesOfRoomMates =roomMates.values();
		
		Iterator<String> itr2=valuesOfRoomMates.iterator();
		System.out.println("**********************************");
		
		while(itr2.hasNext()) {
			
			String str1=(String) itr2.next();
			str1=str1.toUpperCase();
			System.out.println("Values are : "+ str1);
		}
		System.out.println("***********************************");
		// Here we are accessing both keys and values of the data
		
		Set keysAndValues=roomMates.entrySet();
	
		Iterator itr3=keysAndValues.iterator();
		
		while(itr3.hasNext()) {
			
			Map.Entry entry=(Entry) itr3.next();
			
			System.out.println("Key is : "+entry.getKey()+" || "+ "Value is : "+ entry.getValue());
		}
		System.out.println("**********************************");

	}

}
