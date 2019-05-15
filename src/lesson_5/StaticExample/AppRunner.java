package lesson_5.StaticExample;

public class AppRunner {

    public static void main(String[] args) {

        // call static Components:
        ClassWithStaticComponents.setA_static("I am Static");
        ClassWithStaticComponents.printMe_static();

        // call not static Components:
        ClassWithStaticComponents example = new ClassWithStaticComponents();
        example.setA_not_static("I am not static");
        example.printMe_not_static();
    }

}
