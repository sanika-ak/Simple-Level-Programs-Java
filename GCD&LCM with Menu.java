import java.util.Scanner;

public class Main {
    // Function to find GCD
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Function to calculate LCM
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu options
        System.out.println("Choose an operation:");
        System.out.println("1. Calculate GCD");
        System.out.println("2. Calculate LCM");
        System.out.println("3. Exit");

        int choice;
        // Reading Choice from User and for further execution
        System.out.print("Enter your choice (1-3): ");
        choice = sc.nextInt();

            // User Inputs
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // works according to the choice taken by the user
            switch (choice) {
                case 1:
                    // Calculate and display GCD
                    int gcdResult = gcd(num1, num2);
                    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
                    break;

                case 2:
                    // Calculate and display LCM
                    int lcmResult = lcm(num1, num2);
                    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
                    break;

                case 3: 
                    // To Exit program
                    System.out.println("Exiting...");
                    break;

                default:
                    //When user inputs invalid input it works
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                    break;
            }
    }
}
