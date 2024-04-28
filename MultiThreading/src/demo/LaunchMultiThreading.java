package demo;
import java.util.*;
class Banking implements Runnable{
	int accNumOrg=1234;
	int passOrg=9999;
	public void run() {
		System.out.println("Enter your bank account number");
		Scanner scan=new Scanner(System.in);
		int accNum=scan.nextInt();
		
		System.out.println("Enter your password");
		int pass=scan.nextInt();
		if((accNumOrg==accNum)&&(passOrg==pass)) {
			System.out.println("Log in Successfull");
		}
		
	
	}
	public void working() {
		System.out.println("Working");
	}
}

class Print implements Runnable{
	public void run() {
		System.out.println("Numbers are Printing");
	}
}

class Quote implements Runnable{
	public void run() {
		System.out.println("Quoting the quote");
	}
}

public class LaunchMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread Strated");
		try {
		
		Banking bank=new Banking();
		Print print=new Print();
		Quote quote=new Quote();
		
		Thread t1=new Thread(bank);
		Thread t2=new Thread(print);
		Thread t3=new Thread(quote);
		
		
//		bank.banking();
//		print.printing();
//		quote.quoting();
		t1.start();
//		t1.join();
		
		
		
		t2.start();
		
		t3.start();
		
		Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		t3.join();
		System.out.println("Main thread ended.");

	}

}
