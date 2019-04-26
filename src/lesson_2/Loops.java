package lesson_2;

public class Loops {

    public static void main(String[] args) {
        // For loop:
        System.out.println("\nFor Loop: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // the same with while loop:
        System.out.println("\nWhile Loop: ");
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        // another type of for loop (foreach) with arrays
        System.out.println("\nForeach: ");
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : nums) {
            System.out.println("num = " + num);
        }


    }


}
