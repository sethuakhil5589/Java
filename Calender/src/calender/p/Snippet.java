package calender.p;
import java.util.*;

public class Snippet {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	        // Prompt the user to enter day, month, and year 
	        System.out.print("Enter the day: "); 
	        int day = scanner.nextInt();
	        
	        System.out.print("Enter the month: "); 
	        int month = scanner.nextInt();
	
	        System.out.print("Enter the year: "); // Added a missing colon
	        int year = scanner.nextInt();
	
	        scanner.close();
	
	        // Check if the month entered is valid 
	        int totalDays;
	        switch (month) { 
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
	                totalDays = 31;
	                break;
	            case 4: case 6: case 9: case 11: 
	                totalDays = 30;
	                break;
	            case 2: 
	                // Leap year check 
	                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
	                    totalDays = 29;
	                }
	                else {
	                    // Not a Leap Year 
	                    totalDays = 28;
	                }
	                break;
	            default:
	                // Invalid month
	                totalDays = -1;
	        }
	
	        // Check if the day entered is valid 
	        int daysLeft;
	        if (day >= 1 && day <= totalDays) {
	            daysLeft = totalDays - day;
	        } else { 
	            // Invalid day
	            daysLeft = -1;
	        }
	
	        // Check the day is even or odd using ternary operator 
	        String dayType = (day % 2 == 0) ? "even" : "odd";
	
	        // Display the results
	        if (totalDays == -1 && daysLeft == -1) { 
	            // Both invalid Dates and month
	            System.out.println("Invalid month and Invalid date entered.");
	        } else if (totalDays == -1){
	            // Invalid month 
	            System.out.println("Invalid month entered."); 
	        } else if (daysLeft == -1) {
	            // Invalid Day 
	            System.out.println("Invalid day entered.");
	        } else { 
	            System.out.println("There are "+ totalDays + " days in the month you entered in "+ year);
	            System.out.println("Currently, there are "+ daysLeft + " days left in this month");
	            System.out.println("The date you entered is " + dayType);
	        }
}


}

