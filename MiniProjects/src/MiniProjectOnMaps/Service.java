package MiniProjectOnMaps;

import java.util.Scanner;
import java.util.*;

public class Service {
	Scanner scan=new Scanner(System.in);
	
	public void authenticatingUserOrAdmin() {
		System.out.println("Enter 1 if your Admin ");
		System.out.println("Enter 2 if your user ");
		
		int value=scan.nextInt();
		if(value==1) {
			numberOfIds();
		}
		else if(value==2) {
			
		}
		else {
			System.out.println("Enter correct value");
		}
	}
	
	public void numberOfIds() {
		System.out.println("Enter number of ID's your going to add");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			addingDataFromAdmin();
		}
	}
	
	public void addingDataFromAdmin() {
		
		Admin ids=new Admin();
		
		System.out.println("Enter the Id");
		Integer id=scan.nextInt();
		
		HashMap<Integer, Admin> idCard1=new HashMap<>();
		
	}

}
