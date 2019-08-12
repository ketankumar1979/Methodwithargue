package Arguments;

public class Argument5 {

    // Arguments with multiple method

    public static void main ( String []args ){
        addition( 50, 60 );
        addition( 70, 80 );
        substraction(90, 50 );
        substraction( 100, 50);


    }


    public static void addition ( int a, int b ){
        int c= a+b;
        System.out.println ( " Addition of "+a+" and "+b+" =" +c );

    }
    public static void substraction ( int d, int e ){
        int f = d-e;
        System.out.println ( " Substraction  of "+d+" and "+e+" =" +f );
    }
}
