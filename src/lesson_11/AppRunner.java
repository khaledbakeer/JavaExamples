package lesson_11;

import lesson_11.ThePattern.laufen.Humpeln;

/**
 * Strategy Pattern: https://www.philipphauer.de/study/se/design-pattern/strategy.php
 */
public class AppRunner {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.bellen(); //ganz leises bellen...
        husky.laufen(); //Schnelles laufen
        husky.setLaufVerhalten(new Humpeln());
        husky.laufen(); //Humpeln
    }
}
