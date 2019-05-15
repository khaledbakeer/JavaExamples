package lesson_5.Interfaces;

public class AppRunner {

    public static void main(String[] args) {

        Animals dog = new Dog();
        dog.AnimalHome();
        dog.AnimalSound();
        dog.AnimalType();

        System.out.println();

        Cat cat = new Cat();
        cat.AnimalHome();
        cat.AnimalSound();
        cat.AnimalType();
    }

}
