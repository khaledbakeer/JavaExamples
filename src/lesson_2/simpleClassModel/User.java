package lesson_2.simpleClassModel;

/**
 * User Model
 */
public class User {
    String username;
    String firstName;
    String lastName;
    String password;


    /**
     * @param username  String
     * @param firstName String
     * @param lastName  String
     * @param password  String
     */
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
