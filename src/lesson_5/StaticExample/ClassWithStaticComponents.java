package lesson_5.StaticExample;

/**
 * Class With Static Components:
 * ----------------------------
 */
public class ClassWithStaticComponents {

    // static attribute
    private static String a_static;

    // non-static attribute
    private String a_not_static;


    public static void setA_static(String a_static) {
        ClassWithStaticComponents.a_static = a_static;
    }

    public static void printMe_static() {
        System.out.println("To Print: " + ClassWithStaticComponents.a_static);
    }


    public void setA_not_static(String a_not_static) {
        this.a_not_static = a_not_static;
    }

    public void printMe_not_static() {
        System.out.println("To Print: " + this.a_not_static);
    }

}
