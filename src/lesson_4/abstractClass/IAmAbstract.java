package lesson_4.abstractClass;

/**
 * Simple Abstract Class:
 * ----------------------
 * Abstract class in Java is similar to interface except that it can contain default method implementation.
 * An abstract class can have an abstract method without body and it can have methods with implementation also.
 */
public abstract class IAmAbstract {

    /**
     * Constructor:
     * ------------
     */
    public IAmAbstract() {
        System.out.println("Abstract Class is called...");
    }

    /**
     * Abstract method:
     * ----------------
     */
    public abstract void AbstractMethod();
}
