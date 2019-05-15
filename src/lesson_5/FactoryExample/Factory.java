package lesson_5.FactoryExample;

import java.util.ArrayList;
import java.util.List;

public class Factory {


    public void PrintLibrary(List<Book> Library) {
        for (Book x : Library) {
            System.out.println("Author: " + x);
            System.out.println("Author: " + x.getAuthor());
            System.out.println("Author: " + x.getIsbn());
            System.out.println();
        }
    }

    public List<Book> CreateLibrary(int countBooks, int start, int n, String author) {
        List<Book> books = new ArrayList<>();

        for (int i = 0; i < countBooks; i++) {
            Book book = new Book("Title " + i, "1234" + i, "Author " + i);
            books.add(book);
        }

        for (int i = start; i < n + start; i++) {
            books.get(i).setAuthor(author);
        }

        return books;
    }


    public List<Book> SearchFor(String author, List<Book> Library) {

        List<Book> tmp = new ArrayList<>();

        for (Book x : Library) {
            if (x.getAuthor() == author) tmp.add(x);
        }
        return tmp;
    }

    public static void main(String[] args) {

        Factory Factory = new Factory();


        List<Book> Library1 = Factory.CreateLibrary(10, 4, 2, "Muster");
        List<Book> Library2 = Factory.CreateLibrary(8, 2, 2, "Muster");


        List<Book> suchList = Factory.SearchFor("Muster", Library1);


        Factory.PrintLibrary(suchList);


    }


}
