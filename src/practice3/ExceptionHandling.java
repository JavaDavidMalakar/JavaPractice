package practice3;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
        int x = 10;
        int y = 0;
        int result = x / y;
        System.out.println("Result : " + result);
    } catch(ArithmeticException e){
            System.out.println("Exception : "+e);
        }

        System.out.println(" Print last line");

    }
}
