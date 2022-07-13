import library.Book;
import library.Reader;
import library.Administrator;
import library.Supplier;
import library.Librarian;

public class Main {

    public static void main(String[] args) {
        Librarian kirill = new Director();
        Administrator vova = new SmallLibraryWorker();
        SupplierClient andrey = new SupplierClient();
        Supplier andreyAsSuplar = andrey;
        Reader andreyAsReader = andrey;
        Reader sergey = new ReaderImpl();
        Administrator nina = new Secretary();
        Reader rita = new CleaningWoman();

        Book sergeyBook = sergey.getBook(vova, "Робинзон Круза");
        andreyAsReader.getBook(vova, "Мартин Иден");
        vova.notify(sergey);
        sergey.returnBook(sergeyBook);
        andreyAsSuplar.addBooks(new Book[]{
                new Book("Идеальный программист"),
                new Book("Java 8. Полное руководство"),
                new Book("Основы онлайн торговли")
        });
        nina.notify(rita);
        rita.returnBook(rita.getBook(nina, "Война и мир"));
        kirill.orderBooks("Гарри Поттер", 10);
    }
}

