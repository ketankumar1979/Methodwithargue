package Arguments;

public class Returnvalue3 {
    // return methods with multiple UDF methods.
    public static  int addition ( int a, int b ){
        int c= a+b;
        return c;
    }
    public static int substraction ( int d, int e ){
        int f= d-e;
        return f;
    }
    public static void main ( String []args ){
        int c = addition( 50,60 );
        System.out.println ( " Result of addition is =" +c);
        int f=substraction( 200, 100 );
        System.out.println ( " Result of substraction is =" +f);



    }
}
