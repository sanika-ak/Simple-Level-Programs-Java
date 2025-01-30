import java.util.Scanner;

public class MultipleOf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if the number is divisible by 27 by finding the remainder of its division using modulas operator
        if (num % 27 == 0) {
            System.out.println(num + " is a multiple of 27.");
        } else {
            System.out.println(num + " is not a multiple of 27.");
        }
    }
}
