package lesson_2;

/**
 * Class Category:
 * ---------------
 * <p>
 * Category model using an extended class @class lesson_1.Note
 */
public class Category extends Note {

    /**
     * @param title   category title as String
     * @param content category content as String
     */
    public Category(String title, String content) {
        super(title, content);
    }

    @Override
    public String toString() {

        String result = getClass().getSimpleName() + ": {\n" +
                "\t\t title: \"" + this.title + "\"\n" +
                "\t\t content: \"" + this.content + "\"\n" +
                "\t\t }\n";

        return result;
    }
}
