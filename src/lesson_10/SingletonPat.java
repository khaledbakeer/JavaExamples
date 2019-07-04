package lesson_10;

public class SingletonPat {

    /*
     * The Singleton Design Pattern:
     * detailed on: https://www.philipphauer.de/study/se/design-pattern/singleton.php
     */
    //solange nicht benutzt, wird das Einzelstück nicht instanziiert.
    private static SingletonPat einzigartigeBankwerte;

    //Instanziierung bei erstmaligem Aufruf (nicht threadsafe).
    public static SingletonPat getInstance() {
        if (einzigartigeBankwerte == null) {
            einzigartigeBankwerte = new SingletonPat();
        }
        return einzigartigeBankwerte;
    }

    private SingletonPat() {
    }
}