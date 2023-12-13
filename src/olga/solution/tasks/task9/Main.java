package olga.solution.tasks.task9;

public class Main {
    public static void main(String[] args) {

        BookStore bookStore = new BookStore();

        bookStore.addBook(1, "Гарри Поттер", "Джоан Роулинг",
                "Махаон", 2000,
                200, 50, "Твердый переплет");
        bookStore.addBook(1, "Ведьмак", "Рон Бен",
                "Махаон", 2010,
                259, 60.50, "Твердый переплет");
        bookStore.addBook(1, "Метро", "Александр Белый",
                "Махаон", 2011,
                300, 65, "Твердый переплет");

        displayingListOfBooksByAuthor(bookStore, "Джоан Роулинг");

    }

    public static void displayingListOfBooks(BookStore bookStore) {

        for (Book books : bookStore.getBooks()) {

            System.out.println("Книжка: " + books.getTitle() +
                    ", Автор: " + books.getAuthor() +
                    ", Издательство: " + books.getPublishingHouse() +
                    ", Год издательства: " + books.getYearOfPublishing() +
                    ", Количество страниц: " + books.getNumberOfPages() +
                    ", Цена книжки: " + books.getPrice() + "р" +
                    ", Вид переплета: " + books.getBindingType());

        }

    }

    public static void displayingListOfBooksByAuthor(BookStore bookStore, String author) {
        for (Book books : bookStore.getBooks()) {

            if (books.getAuthor().equals(author)) {

                System.out.println("Книжка: " + books.getTitle() +
                        ", Автор: " + books.getAuthor() +
                        ", Издательство: " + books.getPublishingHouse() +
                        ", Год издательства: " + books.getYearOfPublishing() +
                        ", Количество страниц: " + books.getNumberOfPages() +
                        ", Цена книжки: " + books.getPrice() + "р" +
                        ", Вид переплета: " + books.getBindingType());

            }

        }
    }

    public static void displayingListOfBooksByEdition(BookStore bookStore, String publish) {
        for (Book books : bookStore.getBooks()) {

            if (books.getPublishingHouse().equals(publish)) {

                System.out.println("Книжка: " + books.getTitle() +
                        ", Автор: " + books.getAuthor() +
                        ", Издательство: " + books.getPublishingHouse() +
                        ", Год издательства: " + books.getYearOfPublishing() +
                        ", Количество страниц: " + books.getNumberOfPages() +
                        ", Цена книжки: " + books.getPrice() + "р" +
                        ", Вид переплета: " + books.getBindingType());

            }

        }
    }

    public static void displayingListOfBooksAfterTheYear(BookStore bookStore, int yearOfPublishing) {
        for (Book books : bookStore.getBooks()) {

            if (books.getYearOfPublishing() > yearOfPublishing) {

                System.out.println("Книжка: " + books.getTitle() +
                        ", Автор: " + books.getAuthor() +
                        ", Издательство: " + books.getPublishingHouse() +
                        ", Год издательства: " + books.getYearOfPublishing() +
                        ", Количество страниц: " + books.getNumberOfPages() +
                        ", Цена книжки: " + books.getPrice() + "р" +
                        ", Вид переплета: " + books.getBindingType());

            }

        }
    }

}
