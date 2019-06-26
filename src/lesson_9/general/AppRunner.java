package lesson_9.general;

public class AppRunner {
    public static void main(String[] args) {

        // build once
        Composite rootComposite = new Composite();
        rootComposite.add(new Leaf());
        rootComposite.add(new Leaf());

        Composite otherComposite = new Composite();
        rootComposite.add(otherComposite);

        otherComposite.add(new Leaf());
        otherComposite.add(new Leaf());
        otherComposite.add(new Leaf());


        // use the structure
        rootComposite.operation();
    }
}
