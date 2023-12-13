package olga.solution.tasks.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookStore {

    private final List<Book> books = new ArrayList<>();

    public void addBook(int id, String title, String author, String publishingHouse,
                        int yearOfPublishing, int numberOfPages, double price, String bindingType) {
        books.add(new Book(id, title, author, publishingHouse, yearOfPublishing, numberOfPages, price, bindingType));
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookStore bookStore = (BookStore) o;
        return Objects.equals(books, bookStore.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "books=" + books +
                '}';
    }

}
