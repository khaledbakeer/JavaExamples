package lesson_2;

public class IncrementNumbers {

    /**
     * Understanding i++ and ++i
     * https://stackoverflow.com/a/2315717
     *
     * They both increment the number. ++i is equivalent to i = i + 1.
     *
     * i++ and ++i are very similar but not exactly the same.
     * Both increment the number, but ++i increments the number before the current expression is evaluted,
     * whereas i++ increments the number after the expression is evaluated.
     *
     * Using increment in for loops will not make big changes. So, when we disassemble a class with for loop with
     * ++i or i++ will not see any changes. See here: https://stackoverflow.com/a/2315795
     *
     * @param args
     */
    public static void main(String[] args) {

        int i = 3;
        System.out.println("start up by int i = 3;");
        System.out.println("i = " + i);
        System.out.println();

        int a = i++; // a = 3, i = 4
        System.out.println("int a = i++;");
        System.out.println("a = " + a);
        System.out.println("i = " + i);
        System.out.println();

        int b = ++a; // b = 4, a = 4
        System.out.println("int b = ++a;");
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println();

    }
}
