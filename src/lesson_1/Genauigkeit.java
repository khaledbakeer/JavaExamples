package lesson_1;

/**
 * https://stackoverflow.com/questions/322749/retain-precision-with-double-in-java
 * As others have mentioned, you'll probably want to use the BigDecimal class, if you want to have an exact representation of 11.4.
 *
 * Now, a little explanation into why this is happening:
 *
 * The float and double primitive types in Java are floating point numbers,
 * where the number is stored as a binary representation of a fraction (Bruch) and a exponent.
 */
public class Genauigkeit {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double total = 0;
        total += 5.6;
        total += 5.8;
        System.out.println(total); // 11.4 expected
        System.out.println(0f + 5.6f + 5.8f);


        // Sieh hier https://de.wikipedia.org/wiki/Gleitkommazahl#Pr%C3%BCfung_auf_Gleichheit
        System.out.println("Prüfen von der Genauigkeit");
        if (0.362 * 100.0 != 36.2)
            System.out.println("verschieden");

        if (0.362 * 100.0 / 100.0 != 0.362)
            System.out.println("auch verschieden");

    }
}
