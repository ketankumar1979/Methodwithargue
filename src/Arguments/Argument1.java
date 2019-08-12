package Arguments;

public class Argument1 {
    // with  object



    public static   void main( String[] args){
        Argument1 obj = new Argument1();
     obj. addition( 10, 20 );
        obj. addition( 30, 50 );
        obj. addition( 50, 40 );
      System.out.println (" Addition of two variables " );


    }
    // Addition of two variables
    public  void addition(int a, int b ){
        int c = a+b ;
        System.out.println ( "addtion of "+a+" and "+b+" = " +c );



    }
}
