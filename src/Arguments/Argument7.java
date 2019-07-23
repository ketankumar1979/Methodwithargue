package Arguments;

public class Argument7 {
    public void addition ( int a, int b ) {
        int c= a+b;
        System.out.println (" addition of "+a+" and "+b+" = "+c  );

    }


    public static void main ( String[]args ){
        Argument7 obj  = new Argument7();
        obj.addition(50,60 );
        obj.addition(70, 80 );


    }
}
