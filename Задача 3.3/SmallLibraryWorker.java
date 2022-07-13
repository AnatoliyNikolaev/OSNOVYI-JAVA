import library.Administrator;
import library.Book;
import library.Librarian;
import library.Reader;

public class SmallLibraryWorker implements Administrator, Librarian {
    @Override
    public Book search(String bookName) {
        System.out.println("Администратор нашел книгу " + bookName);
        return new Book(bookName);
    }

    @Override
    public void notify(Reader reader) {
        System.out.println("Уведомили о просрочке ");
    }

    @Override
    public void orderBooks(String bookName, int count) {
        System.out.println("Библиотекарь заказал " + count + " книг " + bookName);
    }
}
