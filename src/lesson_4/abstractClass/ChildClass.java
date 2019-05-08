package lesson_4.abstractClass;

public class ChildClass extends IAmAbstract{


    /**
     * Abstract method:
     * ---------------
     */
    @Override
    public void AbstractMethod() {
        System.out.println("Abstract Method is called...");
    }

    /**
     * Main Method:
     * ------------
     * @param args
     */
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        // call an abstract method
        childClass.AbstractMethod();
    }
}
