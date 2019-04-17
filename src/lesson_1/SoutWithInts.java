package lesson_1;

public class SoutWithInts {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Es wird keine Addition gerechnet, sondern nur die beide zahlen am Ende dieser Satze hinzugefügt
        System.out.println("some text and no addition " + a + b); // output: some text and 12

        // Man soll zwei Klammern nicht vergessen
        System.out.println("some text and with addition " + (a + b)); // output: some text and 12
    }
}
