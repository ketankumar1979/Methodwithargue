package Arguments;

public class Argument6 {
    public void login ( String username, String password ) {
        System.out.println (username +" "+ password);
        System.out.println ( " login susseccfully ");

    }
    public static void main ( String []args ){
        Argument6 obj  = new Argument6();
        obj.login( " john1989 ", " chris16 ");
        obj.login( " ketan ", " 123456 ");



    }
}
