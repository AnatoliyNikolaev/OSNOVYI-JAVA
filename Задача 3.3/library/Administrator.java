package library;

public interface Administrator {
    Book search(String bookName);

    void notify(Reader reader);
}
