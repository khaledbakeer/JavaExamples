package lesson_5;

/**
 * Break And Continue:
 * ------------------
 * <p>
 * see examples also here: https://www.w3schools.com/java/java_break.asp
 */
public class BreakAndContinue {

    public static void main(String[] args) {

        int a;


        System.out.println("1. Loop: with \"break\"");
        // 1. Loop
        a = 0;
        while (a < 10) {
            System.out.println("a = " + a);
            // Condition:
            if (a == 4) {
                // do something:
                break; // will stop the loop in this point.
            }
            a++;
        }

        System.out.println("2. Loop: with \"contintue\"");
        // 2. Loop
        a = 0;
        while (a < 10) {
            // Condition:
            if (a == 4) {
                // do something:
                a++;
                continue; // will skipp this step and continue the loop. So, 4 will be skipped
            }
            System.out.println("a = " + a);
            a++;
        }

    }


}
