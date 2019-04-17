package lesson_1;

public class Aufgabe1 {
    public static void main(String[] args) {
        int celsius1 = 20, celsius2 = 40, celsius3 = 120;

        double fahrenheit1 = celsius1 * 1.8 + 32;
        double fahrenheit2 = celsius2 * 1.8 + 32;
        double fahrenheit3 = celsius3 * 1.8 + 32;

        System.out.println(celsius1 + "°C are " + fahrenheit1 + "°F");
        System.out.println(celsius2 + "°C are " + fahrenheit2 + "°F");
        System.out.println(celsius3 + "°C are " + fahrenheit3 + "°F");
    }
}
