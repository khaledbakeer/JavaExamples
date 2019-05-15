package lesson_5.Interfaces;

public class Cat implements Animals {
    @Override
    public void AnimalSound() {
        System.out.println(getClass().getSimpleName() + " has this sound " + "\"Miao Miao!\"");
    }

    @Override
    public void AnimalType() {
        System.out.println(getClass().getSimpleName() + " has this type " + "\"pet\"");
    }

    @Override
    public void AnimalHome() {
        System.out.println(getClass().getSimpleName() + " lives in " + "\"House\"");
    }
}
