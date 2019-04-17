package lesson_1;

public class ConvertFloatToInt {
    public static void main(String[] args) {

        float a = 9.3f;
        int b = 3;
        System.out.println("float (9.3) + int (3) = " + (a + b)); // prints: 12.3 float c = a + b;
        float c = a + b;
        System.out.println(c); // prints: 12.3


        // Convert float to int
        int d = (int) (a + b);
        System.out.println(d); // prints: 12

    }
}
