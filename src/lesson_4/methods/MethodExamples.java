package lesson_4.methods;

import lesson_2.simpleClassModel.Category;

/**
 * Some Types of Method, for more see on https://www.w3schools.com/java/java_methods.asp
 */
public class MethodExamples {

    private int catsSize;
    private int count;
    private Category[] cats;


    /**
     * add: (input values: int, int -> return value int)
     * ----
     * get the sum of two numbers:
     *
     * @param a int
     * @param b int
     * @return int
     */
    public int add(int a, int b) {
        System.out.println(a + "cm + " + b + " = ");
        return a + b;
    }

    /**
     * cmToInch: (intput value: double -> return value double)
     * ---------
     * convert from cm to inch.
     * see on wikipedia about inch https://de.wikipedia.org/wiki/Zoll_(Einheit)
     *
     * @param cm double
     * @return double
     */
    public double cmToInch(double cm) {
        System.out.println(cm + " to inch is: ");
        return 0.393701 * cm;
    }


    /**
     * sumArray: (input value: int[] -> return value int)
     * ---------
     * get sum of all numbers of an int array
     *
     * @param numbers int[]
     * @return int
     */
    public int sumArray(int[] numbers) {
        int sum = 0;
        System.out.println("sum of int numbers in an array of type int: ");
        for (int num : numbers) {
            sum = sum + num;
            if (num == numbers[numbers.length - 1]) System.out.print(num + " = ");
            else System.out.print(num + " + ");
        }
        return sum;
    }

    /**
     * setCatsSize: (return void)
     * ------------
     *
     * @param catsSize int
     */
    public void setCatsSize(int catsSize) {
        this.catsSize = catsSize;
        this.count = this.catsSize;
        cats = new Category[catsSize];
    }

    /**
     * addCategory: (return void)
     * ------------
     * save categories in cats[]
     *
     * @param title   String
     * @param content String
     */
    public void addCategory(String title, String content) {
        if (count - 1 < 0)
            System.out.println("you cannot add any categories anymore, the size of cats array you have set is: " + this.catsSize);
        else {
            cats[count - 1] = new Category(title, content);
            --count;
        }
    }

    /**
     * getCats: (return an array of all saved categories)
     * --------
     *
     * @return Category[]
     */
    public Category[] getCats() {
        return this.cats;
    }

    /**
     * printAllCategories: (return void)
     * -------------------
     */
    public void printAllCategories(Category[] cats) {
        System.out.println("Categories will be printed...");
        for (Category cat : cats) {
            System.out.println(cat);
        }
    }
}
