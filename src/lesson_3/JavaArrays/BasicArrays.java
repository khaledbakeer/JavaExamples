package lesson_3.JavaArrays;

public class BasicArrays {

    public static void main(String[] args) {

        /*
        simpleInt[]:
        ----------
        * is an array from type int.
        * assign some values using the index from this array.
         */
        int[] simpleInt = new int[10];
        // assign a value on an element in this array:
        simpleInt[0] = 100;
        // assign another one:
        simpleInt[1] = 20;
        // get value of the second element:
        System.out.println();
        System.out.println("get value of the second element: " + simpleInt[1]);
        System.out.println();

        /*
        _numbers[]:
         --------
         * is an array from type int.
         *
         */
        // ----- get another array from type int:
        int[] _numbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        System.out.println("print all values of _numbers: ");
        for (int x : _numbers) {
            System.out.println("value x in _numbers = " + x);
        }

        /*
        square_numbers[]:
        -----------------
        * is an array from type int.
        * the values of his elements are the square of the elements of _numbers[]
         */

        // set square_numbers
        System.out.println();
        int square_numbers[] = new int[10];
        for (int i = 0; i < _numbers.length; i++) {
            square_numbers[i] = _numbers[i] * _numbers[i];
        }
        // get square_numbers values
        System.out.println("square_numbers = _numbers^2");
        for (int x : square_numbers) {
            System.out.println("value x in square_numbers = " + x);
        }
        System.out.println();
        /*
        charArray:
        ----------
        * array from type char.
        * Note: String = char[].
         */
        char[] charArray = {'J', 'a', 'v', 'a', ' ', 'C', 'o', 'u', 'r', 's', 'e'};
        System.out.println("Char Array:");
        for (char x : charArray) {
            System.out.print(x);
        }
        System.out.println();
    }

}
