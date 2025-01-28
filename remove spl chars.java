import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input in string firmat
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Remove special characters using "replaceAll" string function
        String newStr = str.replaceAll("[^a-zA-Z0-9 ]", ""); //keeps only alphabets and numbers
        System.out.println("String after removing special characters: " + newStr);
    }
}
