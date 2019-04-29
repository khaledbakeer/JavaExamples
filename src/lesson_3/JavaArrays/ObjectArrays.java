package lesson_3.JavaArrays;

import lesson_2.simpleClassModel.Category;

public class ObjectArrays {
    public static void main(String[] args) {
        /*
        _stringArray[]:
        --------------
        * is a simple array with string elements
        *
         */
        // arr4 is an array from type String
        System.out.println();
        System.out.println("String Array:");
        String[] arr4 = new String[4];
        arr4[0] = "I ";
        arr4[1] = "am ";
        arr4[2] = "a ";
        arr4[3] = "programmer ";

        for (String x : arr4) {
            System.out.print(x);
        }
        System.out.println("\n");

        /*
        catsArray[]:
        * is an object of our Category model, (see lesson_2.simpleClassModel.Category)
         */
        Category[] catsArray = new Category[4];

        catsArray[0] = new Category("News", "Alles über IT Neuigkeiten");
        catsArray[1] = new Category("Sport", "Neuigkeiten von Fußball, Basketball, ...");
        catsArray[2] = new Category("Programming", "Java, C, C++, PHP, ...");
        catsArray[3] = new Category("Frameworks", "Spring Boot, Laravel, ...");

        // print all categories, that I have.
        for (Category x : catsArray) {
            System.out.println(x.getInfo());
        }
    }
}
