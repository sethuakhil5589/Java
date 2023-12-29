package demo.launch;
import java.util.*;

class UserInformationInvaild extends Exception{

	public UserInformationInvaild(String msg) {
		super (msg);
	}
	
}

class ATM{
	private int userId;
	private int password;
	int user;
	int pass;
	public void input() {
		userId=1234;
		password=9999;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the user id ");
		user=scan.nextInt();
		System.out.println("Please enter the password");
		pass=scan.nextInt();
	}
	
	public void verify() throws UserInformationInvaild {
		if(userId==user && password==pass) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the amount");
			int amount=scan.nextInt();
			System.out.println("Take your cash: "+amount);
		}
		else {
//			System.out.println("Please enter the correct credentials");
			UserInformationInvaild uii=new UserInformationInvaild("Please enter the correct credentials");
			throw uii ;
		}
	}
}

class Bank{
	public void banking() throws UserInformationInvaild {
		ATM atm= new ATM();
		atm.input();
		try {
			atm.verify();
		} catch (UserInformationInvaild e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid credentials this is your first trail");
			atm.input();
			try {
				atm.verify();
			} catch (UserInformationInvaild e1) {
				System.out.println(e.getMessage());
				System.out.println("Invalid credentials this is your second trail");
				atm.input();
				try {
					atm.verify();
				} catch (UserInformationInvaild e2) {
					System.out.println(e2.getMessage());
					System.out.println("Invalid credentials this is your last trail");
					atm.input();
					try {
						atm.verify();
					} catch (UserInformationInvaild e3) {
						System.out.println(e3.getMessage());
						System.out.println("Your card was blocked for 24 hours");
						
					}
				}
			}
		}
		
	}
}

public class LaunchExceptionHandlingProject1 {

	public static void main(String[] args) throws UserInformationInvaild {
		Bank bank = new Bank();
		bank.banking();

	}

}
