public class InfiniteLoops {
    public static void main(String[] args) {
        // Infinite for loop
        // No particular range is set so it loops Infinite timees
        for (;;) {
            System.out.println("This is an infinite for loop!");
        }

        // Infinite while loop 
        // No condition is checked so it always returns true and prints the message Infinite times
        while (true) {
            System.out.println("This is an infinite while loop!");
        }
    }
}

// Only one loop can be used at one in a program as the first loop doenot end it cannot go to the second loop.
