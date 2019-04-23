package lesson_2.simpleClassModel;

/**
 * Note model, mother class of post and category classes
 */
public class Note {
    String title;
    String content;

    /**
     * Constructor:
     *
     * @param title   category title as String
     * @param content category content as String
     */
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
