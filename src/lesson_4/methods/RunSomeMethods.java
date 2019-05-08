package lesson_4.methods;

import lesson_2.simpleClassModel.Category;

public class RunSomeMethods {
    public static void main(String[] args) {

        MethodExamples m = new MethodExamples();


        // add:
        System.out.println(m.add(10, 6) + "\n"); // 16

        // cmToInch:
        System.out.println(m.cmToInch(5) + "\n");

        // sumArray:
        int[] nums = {1, 2, 3, 4};
        System.out.println(m.sumArray(nums) + "\n");

        // set count of Category = 3
        m.setCatsSize(3);

        // add cat (you can add 3):
        m.addCategory("sport", "football, basketball, ...");
        m.addCategory("News", "News from the world ...");
        m.addCategory("Languages", "German, English, ...");
        // m.addCategory("a","aa"); // you cannot add this one, output: you cannot add any categories anymore, the size of cats array you have set is: 3


        // get all saved Categories:
        Category[] allCategories = m.getCats();

        // printAllCategories
        // print saved categories:
        m.printAllCategories(allCategories);
    }
}
