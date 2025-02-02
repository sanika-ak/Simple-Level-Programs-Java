public class Palindrome {
    // Function to check palindrome
    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str);  // Using StringBuilder class to create a New String for reverse string whenever created without manually creating another string
        reversed.reverse();  /// Using .reverse() function to reverse the string
        return str.equals(reversed.toString());  //Checking if the Original String and the Reversed String are same or not by using .equals() Method
    }

    // Main Function
    public static void main(String[] args) {
        String str = "madam";

        // Calling User created Function to check Palindrome
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome."); // If Function returns true
        } else {
            System.out.println(str + " is not a palindrome.");  // If Function returns false
        }
    }
}
