import java.util.Scanner;

public class GCD {
  //GCD function
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User Input 
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Function Call
        int result = gcd(num1, num2);
        
        // print result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
