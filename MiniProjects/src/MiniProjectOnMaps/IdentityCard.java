package MiniProjectOnMaps;
import java.util.*;
import java.util.Map.Entry;




public class IdentityCard {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		HashMap<Integer, Person> ids=new HashMap<>();
		
		for(int i=101;i<103;i++) {
			System.out.println("Enter Details for: "+i);
			System.out.print("Name: ");
			String name=scan.nextLine();
			System.out.print("Age: ");
			int age=scan.nextInt();
			scan.nextLine();
			System.out.print("City: ");
			String city=scan.nextLine();
			
			Person person=new Person(name,age,city);
			ids.put(i, person);
		}
		
		System.out.println("Enter the value as per given data");
		System.out.println("To get all keys press 1");
		System.out.println("To get all values press 2");
		System.out.println("To get all complete data press 3");
		
		int option=scan.nextInt();
		
		
		
		if(option==1) {
			Set<Map.Entry<Integer, Person>> idsSet1=ids.entrySet();
			Iterator<Entry<Integer, Person>> itr1=idsSet1.iterator();
			while(itr1.hasNext()) {
				System.out.println("Keys are: "+ itr1.next().getKey()); 
			}
		}
		
		else if(option==2) {
			Set<Map.Entry<Integer,Person>>idsSet2 =ids.entrySet();
			Iterator<Entry<Integer, Person>> itr2=idsSet2.iterator();
			
			while(itr2.hasNext()) {
				System.out.println("Values are: "+ itr2.next().getValue()); 
			}
		}
		
		else if(option==3) {
			for(Map.Entry<Integer, Person> entry:ids.entrySet()) {
				int id=entry.getKey();
				Person person=entry.getValue();
				
				System.out.println("Id :"+id+" "+ person);
			}
		}
		
		else {
			System.out.println("Enter the correct value");
		}

	}

}
