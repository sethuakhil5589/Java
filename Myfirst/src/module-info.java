import java.util.Scanner;

public class SchedulePlanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter day, month, and year 
		System.out.print("Enter the day: "); 
		int day = scanner.nextInt();
		
		System.out.print("Enter the month: "); 
		int month = scanner.nextInt();

		System.out.print("Enter the year"); 
		int year = scanner.nextInt();

		scanner.close();

		// Check if the month entered is valid 
		int TotalDays;
		switch (month) { 
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				TotalDays = 31;
				break;
			case 4: case 6: case 9: case 11: 
				TotalDays = 30;
				break;
			case 2: 
				//Leap year check 
				if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) { 
					TotalDays = 29;
				}
				else {
					//Not a Leap Year 
					TotalDays = 28;
				}
				break;
			default:
				// Invalid month
				TotalDays = -1;
}

// Check if the day entered is valid 
int daysLeft;
if (day >=1 && day <= TotalDays) {
	daysLeft = TotalDays - day;
}else { 
	// Invalid day
	daysLeft = -1;
}

// Check the day is even or odd using ternary operator 
String dayType = (day % 2 == 0) ? "even": "odd";

// Display the results
if (TotalDays == -1 & daysLeft == -1) { 
	//Both invalid Dates and month
	System.out.println("Invalid month and Invalid date entered.");
}
else if (TotalDays == -1){
	//Invalid month 
	System.out.println("Invalid month entered."); 
} else if (daysLeft == -1) {
	//Invalid Day 
	System.out.println("Invalid day entered.");
} else { 
	System.out.println("There are "+ TotalDays+" days of the month you entered in "+year);
	System.out.println("Currently, there are "+ daysLeft +" days left of this month");
	System.out.println("The date you entered is " + dayType);
}
	}
}
