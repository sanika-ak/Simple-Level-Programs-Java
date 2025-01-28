import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input with Scanner class
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year or not Using if..else conditional statement
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

    }
}
