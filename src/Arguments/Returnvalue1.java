package Arguments;

public class Returnvalue1 {
    public static void main ( String []args ){
        int c = ( addition( 10, 20 ));
        System.out.println ( " Result of addition = "+c);

    }
    public static int addition ( int a, int b ){
        int c = a+b;
        return c;

    }

}
