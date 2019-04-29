package lesson_3.javaAccessModifiers;

public class Child {

    public static void main(String[] args) {

        Father father = new Father();

        // Will not work:
        // father.Secret = "will not work, secret is private variable";

        // Work:
        // set new secret
        father.setSecret("neue Secret"); // secret setter is a public method.

        // getSecret is also public method to get value of secret
        String x = father.getSecret();

        // Print value of secret
        System.out.println(x);


        // Empty Line:
        System.out.println();

    }
}
