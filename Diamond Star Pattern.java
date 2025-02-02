public class DiamondStarPattern {

    public static void main(String[] args) {
        int n = 7; // Number of rows
      
        // Print the upper half of the diamond
        // The stars in the line Increases with the Number of Row Increases
        for (int i = 1; i <= n; i++) {
            // Print white spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        // The stars in the line Decreases with the Number of Row Decreases
        for (int i = n - 1; i >= 1; i--) {
            // Print white spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
