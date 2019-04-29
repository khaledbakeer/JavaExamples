package lesson_3.JavaArrays;

public class FunctionTable {

    public FunctionTable(int from, int to) {
        printTable(from, to);
    }

    /**
     * @param from int
     * @param to   int
     */
    private void printTable(int from, int to) {
        if (to > from && to > 0 && from > 0) {
            // 2D Array:
            int max = to + 1;
            double[][] arr5 = new double[max][2];
            System.out.println("Function table: ");

            // set numbers on arr5
            for (int i = from; i < max; i++) {
                arr5[i][0] = i;
                arr5[i][1] = Math.sqrt(i * i + 2 * i + 1);
            }

            for (int r = from; r < arr5.length; r++) {
                for (int s = 0; s < arr5[r].length; s++) {
                    System.out.print(arr5[r][s] + "\t |");
                }
                System.out.println();
            }
        } else {
            System.out.println("please, write a correct scope, ex. from = 2, to = 10");
        }
    }

    public static void main(String[] args) {
        // run the code here
        FunctionTable ft = new FunctionTable(3, 9);
    }

}
