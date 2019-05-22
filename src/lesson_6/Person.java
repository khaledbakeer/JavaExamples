package lesson_6;

public class Person {

    String forename, lastname;
    int age;


    public Person(String forename, String lastname, int age) {

        if (forename == null)
            throw new NullPointerException("your value of forname in " + getClass().getSimpleName() + "Class cannot be null");
        else if (forename == "")
            throw new IllegalArgumentException("your value of forname in \" + getClass().getSimpleName() + \"Class cannot be empty");
        else this.forename = forename;


        if (lastname == null)
            throw new NullPointerException("your value of lastname in " + getClass().getSimpleName() + "Class cannot be null");
        else if (lastname == "")
            throw new IllegalArgumentException("your value of lastname in " + getClass().getSimpleName() + "Class cannot be empty");
        else this.lastname = lastname;

        if (age < 1)
            throw new IllegalArgumentException("your value of age in " + getClass().getSimpleName() + "Class cannot be smaller than 1");
        else if (age > 100)
            throw new IllegalArgumentException("your value of age in " + getClass().getSimpleName() + "Class cannot be greater than 100");
        else this.age = age;
    }
}
