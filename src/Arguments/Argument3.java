package Arguments;

public class Argument3 {

    // argument with multiple method by object
    public static void main ( String []args ){
         Argument3 obj = new Argument3();
         obj.addition( 50, 60 );
        obj.addition( 70, 80 );
        obj.substraction(90, 50 );
        obj.substraction( 100, 50);

    }


    public  void addition ( int a, int b ){
        int c= a+b;
        System.out.println ( " Addition of "+a+" and "+b+" =" +c );

    }
    public  void substraction ( int d, int e ){
        int f = d-e;
        System.out.println ( " Substraction  of "+d+" and "+e+" =" +f );
    }
}




