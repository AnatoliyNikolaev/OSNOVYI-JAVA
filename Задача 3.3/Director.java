import library.Librarian;

public class Director implements Librarian {
    @Override
    public void orderBooks(String bookName, int count) {
        System.out.println("Библиотекарь заказал " + count + " книг " + bookName);
    }
}
