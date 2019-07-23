package Arguments;

public class Argument8 {

    public void  divide ( int a, int b ){
        int c= a/b;
        System.out.println(c);
    }
    public void divide ( long d, int e ){
        long f=d*e;

        System.out.println(f);

    }
    public static void main ( String []args ){
        Argument8 obj = new Argument8();
        obj.divide(50,10);
        obj.divide(100,10);

    }
}
