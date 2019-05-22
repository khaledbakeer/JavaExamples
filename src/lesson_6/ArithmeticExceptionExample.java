package lesson_6;

public class ArithmeticExceptionExample {


    public static void main(String[] args) {

//      ArithmeticException (does not have to) be handled. See the commented example below:
//        int b = 7 / 0;
//        // will cause an ArithmeticException
//        System.out.println(b);


        // (can) be handled.
        try {
            int a = 7 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }


        // printStackTrace:
        try {
            int c = 7 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
            e.printStackTrace(); // to show the point where the exception occurs.
        }


        // The finally-block will always be executed, regardless if an exception occurs.
        try {
            int d = 7 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
            e.printStackTrace();
        } finally {
            System.out.println("End of program.");
        }


        var x = 0;
        try {
            x = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        System.out.println(x);

    }


    public static int divide(int divident, int divisor) throws ArithmeticException {
        return divident / divisor;
    }

}
