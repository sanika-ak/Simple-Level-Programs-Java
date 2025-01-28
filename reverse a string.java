import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // creating an empty string to store reverse string value
        String reversedStr = "";
        // using for loop to iterate from last letter of the string snd store it in the empty string variable
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // output 
        System.out.println("Reversed string: " + reversedStr);
    }
}
