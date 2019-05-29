package lesson_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {


    /**
     * sum:
     * ----
     *
     * @param list
     * @return ...
     * <p>
     * Java Generics Upper Bounded Wildcard:
     * -------------------------------------
     * Upper bounded wildcards are used to relax the restriction on the type of variable in a method.
     * Suppose we want to write a method that will return the sum of numbers in the list,
     * y    * so our implementation will be something like this.
     */
    public static double sum(List<Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }


    /**
     * printData:
     * ----------
     *
     * @param list ..
     *             <p>
     *             Java Generics Unbounded Wildcard:
     *             ---------------------------------
     *             Sometimes we have a situation where we want our generic method to be working with all types,
     *             in this case unbounded wildcard can be used. Its same as using <? extends Object>.
     *             <p>
     *             More info see here: https://www.journaldev.com/1663/java-generics-example-method-class-interface#java-generic-class
     */
    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + ", ");
        }
    }


    public static void main(String[] args) {
        List<Object> x = new ArrayList<>(Arrays.asList("a b c d e f g h i g k l m n o p q r s t u v w x y z".split(" ")));
        x.add(2);

        printData(x);

    }

}
