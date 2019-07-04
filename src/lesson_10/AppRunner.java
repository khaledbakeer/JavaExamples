package lesson_10;

public class AppRunner {

    public static void main(String[] args) {
        // cannot make an instance
        // SingletonPat singletonPat = new SingletonPat();

        // get the instance:
        var x = SingletonPat.getInstance();
    }


}
