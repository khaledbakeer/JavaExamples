package lesson_2;

public class Category extends Note {

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
