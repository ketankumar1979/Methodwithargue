package Arguments;

public class Argument4 {

    //simple argument
    public static  void main ( String []args ){

        division( 30, 6 );
        division( 40, 4 );
        division( 100, 20 );

    }



    public static void division(int a, int b ){
        int c = (a/b);
        System.out.println( " Division of "+a+" and "+b+" = " +c );



    }

}
