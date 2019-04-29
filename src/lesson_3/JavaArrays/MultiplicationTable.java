package lesson_3.JavaArrays;

public class MultiplicationTable {
    public MultiplicationTable(int num) {
        MultiplicationTable(num);
    }

    /**
     * ---------------------
     * Multiplication Table:
     * ---------------------
     * <p>
     * is an example for 2d Arrays
     *
     * @param num int > 2
     */
    private void MultiplicationTable(int num) {
        if (num > 2) {
            // 2D Arrays:
            int[][] arr5 = new int[num][num];
            System.out.println("Multiplication table");

            // set numbers on arr5
            for (int r = 0; r < num; r++) {
                for (int s = 0; s < num; s++) {
                    arr5[r][s] = r * s;
                }
            }

            // get numbers from arr5
            for (int r = 1; r < num; r++) {
                for (int s = 1; s < num; s++) {
                    System.out.print(arr5[r][s] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("table min 3x3");
        }

    }

    public static void main(String[] args) {
        // run one line code:
        MultiplicationTable mt = new MultiplicationTable(10);
    }
}
