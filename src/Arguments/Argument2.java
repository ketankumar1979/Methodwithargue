package Arguments;

public class Argument2 {
    // without object
    public static void main ( String []args ){
        substraction ( 100 , 50 );
        substraction ( 200 , 40 );
        substraction ( 300 , 60 );
        substraction ( 60 , 40 );


    }
    public static void substraction ( int d, int e ){
        int  k = ( d-e );

        System.out.println( " Substraction of "+d+" and "+e+" = " +k );


    }

}
