import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take score input from user
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        // Find grade using conditional statements
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print the grade
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
