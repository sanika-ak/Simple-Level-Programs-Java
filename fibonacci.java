import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // first two numbers of the series
        int a = 0;
        int b = 1;

        // iterating with the user given value as limit
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // prints the numbers one by one with whitespace in between
            b = a + b; //updates the value of b to the sum of the current a and b which gives the next Fibonacci number in the sequence
            a = b - a; //like the previous line, updates the value of a to the previous value of b 
        }
    }
}
