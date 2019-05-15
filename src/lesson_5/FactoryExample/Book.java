package lesson_5.FactoryExample;

public class Book {

    private String Title;

    private String Isbn;

    private String Author;

    public Book(String title, String isbn, String author) {
        Title = title;
        Isbn = isbn;
        Author = author;
    }

    @Override
    public String toString() {
        return this.Title;
    }

    public String getIsbn() {
        return Isbn;
    }

    public String getAuthor() {
        return Author;
    }


    public void setAuthor(String author) {
        Author = author;
    }
}
