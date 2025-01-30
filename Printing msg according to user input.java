// Write a Program to check the given number is divisible by both 3&4 if it is so print "Good Morning". If a number is divisible by only 4 but not 3 then print "Good Afternoon". 
//If it is divisible by only 3 but not 4 then print "Good Evening" otherwise print "Good Night".? 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter A: ");
        a = sc.nextInt();
        
        if (a%3==0 & a%4==0)
        {
            System.out.println("Good Morning");
        }
        else if (a%3!=0 & a%4==0)
        {
            System.out.println("Good Afternoon");
        }
        else if (a%3==0 & a%4!=0)
        {
            System.out.println("Good Evening");
        }
        else
        {
            System.out.println("Good Night");
        }
    }
}
