//Find the number belonging to which group above 50, between 40 to 50, less than 40.? 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A: ");
        a = sc.nextInt();
        
        if (a>50)
        {
            System.out.println("Group A");
        }
        else if (a >= 40 & a <= 50)
        {
            System.out.println("Group B");
        }
        else if (a<40)
        {
            System.out.println("Group C");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
