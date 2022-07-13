package library;

public interface Reader {
    Book getBook(Administrator administrator, String bookName);

    void returnBook(Book book);
}
