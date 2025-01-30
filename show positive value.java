import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get User Input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Addition
        int add = num1 + num2;
        
        // Subraction
        int sub = num1 - num2;
       // Checks if the result is negative and changes it into positve number by munltiplying it with -1
        if (sub < 0) {
            subt = -1*sub;  
        }
        
        //Print Output
        System.out.println("Addition result: " + add);
        System.out.println("Subtraction result: " + sub);
    }
}
