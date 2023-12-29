package vaishu_project_calender;
import java.util.*;

public class Calender {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("The day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("The month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("The year: ");
        int year = scanner.nextInt();

        scanner.close();

        // Determine how many days there are in the specified month and year.
        int totalDaysInMonth = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                totalDaysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                totalDaysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    totalDaysInMonth = 29;
                } else {
                    totalDaysInMonth = 28;
                }
                break;
            default:
                System.out.println("Month entered is incorrect.");
                System.exit(1);
        }

        // A valid day should be found.
        if (day < 1 || day > totalDaysInMonth) {
            System.out.println("Day entered is invalid.");
            System.exit(1);
        }

        // Determine how many days are left in the month.
        int daysLeftInMonth = totalDaysInMonth - day;

        // Determine if the current day is even or odd
        String evenOrOdd = (day % 2 == 0) ? "even" : "odd";

        // Print the outcomes
        System.out.println("Total days in " + month + "-" + year + ": " + totalDaysInMonth);
        System.out.println("Days left in " + month + "-" + year + ": " + daysLeftInMonth);
        System.out.println("Current day is " + evenOrOdd + ".");

	}

}
