package lesson_2;

import java.util.Date;

/**
 * App Runner:
 * All classes will be called here. Run the program.
 */
public class AppRunner {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create a user _user
        var _user = new User("someuser", "Max", "Muster", "123456");
        // Create a category
        var _cat = new Category("News", "news cat");
        // set a date
        var _date = new Date(2019, 04, 23, 13, 00);

        // create a post
        var _post = new Post("Subject 01", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr.", _cat, _date, _user);
        // create another one
        var _post1 = new Post("Subject 02", "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.", _cat, _date, _user);

        // Print my posts
        System.out.println(_post);
        System.out.println(_post1);

    }
}
