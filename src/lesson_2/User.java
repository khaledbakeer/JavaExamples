package lesson_2;

public class User {
    String username;
    String firstName;
    String lastName;
    String password;


    public User(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    @Override
    public String toString() {

        String result = getClass().getSimpleName() + ": {\n" +
                "\t\t username: \"" + this.username + "\"\n" +
                "\t\t firstName: \"" + this.firstName + "\"\n" +
                "\t\t lastName: \"" + this.lastName + "\"\n" +
                "\t\t password: \"" + this.password + "\"\n" +
                "\t\t }\n";

        return result;
    }

}
