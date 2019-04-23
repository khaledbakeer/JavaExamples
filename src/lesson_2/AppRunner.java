package lesson_2;

import java.util.Date;

public class AppRunner {

    public static void main(String[] args) {

        var _user = new User("someuser", "Max", "Muster", "123456");
        var _cat = new Category("News", "news cat");
        var _date = new Date(2019, 04, 23, 13, 00);

        var _post = new Post("Subject 01", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr.", _cat, _date, _user);
        var _post1 = new Post("Subject 02", "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.", _cat, _date, _user);

        System.out.println(_post);
        System.out.println(_post1);

    }
}
