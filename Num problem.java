import java.util.Scanner
class Main {
    public static void main(String[] args) {
        int a;
        int b;
        
        System.out.println("Enter A: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        
        System.out.println("Enter B: ");
        Scanner s = new Scanner(System.in);
        b = s.nextInt();
        
        if (a>b)
        {
            System.out.println("A is greater");
        }
        else
        {
            System.out.println("B is greater");
        }
    }
}
