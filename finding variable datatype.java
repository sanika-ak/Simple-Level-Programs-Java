public class DataTypeCheck {
    public static void main(String[] args) {
        int a = 10; 
        double b = 3.14;
        char c = 'A';
        boolean d = true;
        String e = "Hello, Java!";

      // .getclass().getSimpleName() function is used to find the datatype
        System.out.println("Data type of a: " + ((Object) a.getClass().getSimpleName());
        System.out.println("Data type of b: " + ((Object) b).getClass().getSimpleName());
        System.out.println("Data type of c: " + ((Object) c).getClass().getSimpleName());
        System.out.println("Data type of d: " + ((Object) d).getClass().getSimpleName());
        System.out.println("Data type of e: " + e.getClass().getSimpleName());
    }
}
