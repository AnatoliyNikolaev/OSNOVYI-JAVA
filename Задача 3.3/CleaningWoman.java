import library.Administrator;
import library.Book;
import library.Reader;

public class CleaningWoman implements Reader {

    @Override
    public Book getBook(Administrator administrator, String bookName) {
        final Book targetBook = administrator.search(bookName);
        System.out.println("Уборщица получила книгу " + targetBook);
        return targetBook;
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Уборщица вернула книгу " + book + " в библиотеку ");

    }
}

