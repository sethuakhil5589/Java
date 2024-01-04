package MiniProjectOnMaps;
import java.util.*;
import java.util.Map.Entry;


public class IdentityCard {

	private HashMap<Integer, Person> ids=new HashMap<>();
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		IdentityCard idCard=new IdentityCard();
		
		idCard.inputData();
		
		idCard.fetchingDataByUser();
		
	}
	
	public void inputData() {
		
		System.out.println("Enter number of id's you want to add.");
		int noOfIds=(scan.nextInt())+101;
		scan.nextLine();
		for(int i=101;i<noOfIds;i++) {
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
	}
	
	public void fetchingDataByUser() {
		
		int option;
		do {
		System.out.println("Enter the value as per given data");
		System.out.println("To get all keys press 1");
		System.out.println("To get all values press 2");
		System.out.println("To get all complete data press 3");
		System.out.println("To exit press 4");
		option=scan.nextInt();
		
		switch(option) {
		case 1:
			Set<Map.Entry<Integer, Person>> idsSet1=ids.entrySet();
			Iterator<Entry<Integer, Person>> itr1=idsSet1.iterator();
			while(itr1.hasNext()) {
				System.out.println("Keys are: "+ itr1.next().getKey()); 
			}
			break;
		case 2:
			Set<Map.Entry<Integer,Person>>idsSet2 =ids.entrySet();
			Iterator<Entry<Integer, Person>> itr2=idsSet2.iterator();
			
			while(itr2.hasNext()) {
				System.out.println("Values are: "+ itr2.next().getValue()); 
			}
			break;
		case 3:
			for(Map.Entry<Integer, Person> entry:ids.entrySet()) {
				int id=entry.getKey();
				Person person1=entry.getValue();
				
				System.out.println("Id :"+id+" "+ person1);
			}
			break;
		case 4:
			System.out.println("Thank you");
			break;
			
		default:
			System.out.println("Enter correct value");
		}
		
		}while(option !=4);
	
	}
	
}
