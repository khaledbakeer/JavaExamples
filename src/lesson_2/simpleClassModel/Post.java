package lesson_2.simpleClassModel;

import java.util.Date;

/**
 * Post Model
 */
public class Post extends Note {
    Category category;
    Date dateTime;
    User user;

    /**
     * @param title    String
     * @param content  String
     * @param category String
     * @param dateTime Date
     * @param user     User model
     */
    public Post(String title, String content, Category category, Date dateTime, User user) {
        super(title, content);
        this.category = category;
        this.dateTime = dateTime;
        this.user = user;
    }

    @Override
    public String toString() {
        String post = getClass().getSimpleName();
        String postTitle = this.title;
        Category postCategory = this.category;
        Date postDate = this.dateTime;
        String postContent = this.content;
        User postUser = this.user;

        String result = post + ": {\n" +
                "\t title: \"" + postTitle + "\"\n" +
                "\t category: " + postCategory + "\n" +
                "\t dateTime: \"" + postDate + "\"\n" +
                "\t content: \"" + postContent + "\"\n" +
                "\t user: " + postUser + "\n" +
                "\t}\n";
        return result;
    }

}
