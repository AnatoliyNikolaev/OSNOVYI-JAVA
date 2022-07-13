import library.Administrator;
import library.Book;
import library.Reader;

public class ReaderImpl implements Reader {

    @Override
    public Book getBook(Administrator administrator, String bookName) {
        final Book targetBook = administrator.search(bookName);
        System.out.println("Получили книгу " + targetBook);
        return targetBook;
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Вернули книгу " + book + " в библиотеку ");

    }
}
