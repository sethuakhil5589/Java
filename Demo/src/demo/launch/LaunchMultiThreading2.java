package demo.launch;

import java.util.Scanner;

class Main implements Runnable{
	int accNumOrg=1234;
	int passOrg=9999;
	@Override
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("bankThread")) {
			banking();
			
			
		}
		
		else if(tName.equalsIgnoreCase("workingThread")) {
			working();
		}
		else {
			System.out.println("Thread not found");
		}
	}
	
	public void banking() {
		System.out.println("In thread 2 banking");
//		Scanner scan=new Scanner(System.in);
//		int accNum=scan.nextInt();
//		
//		System.out.println("Enter your password");
//		int pass=scan.nextInt();
//		if((accNumOrg==accNum)&&(passOrg==pass)) {
//			System.out.println("Log in Successfull");
//		}
	
	}
	public void working() {
		System.out.println("In thread 2 working");
	}
	
	
	}

class Print1 implements Runnable{
	public void run() {
		System.out.println("In thread 1 printing");
	}
}

class Quote1 implements Runnable{
	public void run() {
		System.out.println("In thread 3 quoting");
	}
}





public class LaunchMultiThreading2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread Strated");
		Main bank=new Main();
		Print1 print=new Print1();
		Quote1 quote=new Quote1();
		
		Thread t1=new Thread(print);
		Thread t2=new Thread(bank);
		Thread t201=new Thread(bank);
		Thread t3=new Thread(quote);
		
		t2.setName("bankThread");
		t201.setName("workingThread");
		
		t3.start();
		t2.join();
		
		t2.start();
		t201.join();
		t201.start();
		t1.join();
		t1.start();
		
		

	}

}
