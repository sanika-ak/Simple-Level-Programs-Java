import java.util.Scanner;
class Main {
  //Function to check greatest number
    public static void greatest(int a,int b,int c)
    {
        //uses if..else if..else conditional statement
        if (a>b && a>c)
        {
            System.out.println("A is Greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Greatest");
        }
        else if(c>a && c>b)
        {
            System.out.println("C is Greatest");
        }
        else 
        {
            System.out.println("Two or More numbers are equal"); //prints this statement when numbers are equal in value
        }
    }
    
    public static void main(String[] args) {
        //main program
        // Usig Scanner class getting user inputs
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter A:");
        int a=s.nextInt();
        
        System.out.println("Enter B:");
        int b=s.nextInt();
        
        System.out.println("Enter C:");
        int c=s.nextInt();

        // Calling the user-built function
        greatest(a,b,c);
    }
}

//ANOTHER METHOD
//import java.util.Scanner;
//class Main {
   //public static void main(String[] args) {
        //Scanner s=new Scanner(System.in);
        
        //System.out.println("Enter A:");
        //int a=s.nextInt();
        
        //System.out.println("Enter B:");
        //int b=s.nextInt();
        
        //System.out.println("Enter C:");
        //int c=s.nextInt();
        
        //if (a>b && a>c)
        //{
           // System.out.println("A is Greatest");
        //}
        //else if(b>a && b>c)
        //{
            //System.out.println("B is Greatest");
        //}
        //else
        //{
            //System.out.println("C is Greatest");
        //}
   // }
//}
