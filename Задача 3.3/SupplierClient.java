import library.Administrator;
import library.Book;
import library.Reader;
import library.Supplier;

public class SupplierClient implements Reader, Supplier {

    @Override
    public Book getBook(Administrator administrator, String bookName) {
        final Book targetBook = administrator.search(bookName);
        System.out.println("Поставщик получили книгу " + targetBook);
        return targetBook;
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Поставщик вернул книгу " + book + "в библиотеку");
    }

    @Override
    public void addBooks(Book[] books) {

        System.out.println("Поставщик поставил следующие книги:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

    }
}
