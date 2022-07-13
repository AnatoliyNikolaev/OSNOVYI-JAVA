import library.Administrator;
import library.Book;
import library.Librarian;
import library.Reader;

public class Secretary implements Administrator, Librarian, Reader {
    @Override
    public Book search(String bookName) {
        System.out.println("Секретарь нашла книгу " + bookName);
        return new Book(bookName);
    }

    @Override
    public void notify(Reader reader) {
        System.out.println("Секретарь уведомила о просрочке ");
    }

    @Override
    public void orderBooks(String bookName, int count) {
        System.out.println(" заказала " + count + "книг");
    }

    @Override
    public Book getBook(Administrator administrator, String bookName) {
        final Book targetBook = administrator.search(bookName);
        System.out.println("Получила книгу " + targetBook);
        return targetBook;
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Вернула книгу " + book + " в библиотеку ");
    }
}
