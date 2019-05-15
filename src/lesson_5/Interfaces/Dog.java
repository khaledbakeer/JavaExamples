package lesson_5.Interfaces;

public class Dog implements Animals {

    @Override
    public void AnimalSound() {
        System.out.println(getClass().getSimpleName() + " has this sound " + "\"wof wof!\"");
    }

    @Override
    public void AnimalType() {
        System.out.println(getClass().getSimpleName() + " has this type " + "\"pet\"");
    }

    @Override
    public void AnimalHome() {
        System.out.println(getClass().getSimpleName() + " lives in " + "\"Apartments\"");
    }
}
