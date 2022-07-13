public class Book {
    public static int maxpages;

    public int pages;
    public String publishingHouse;
    public int tom;
    public int godIzdaniya;
    public String language;
    public String author;

    public Book(int pages, String publishingHouse, int tom, int godIzdaniya, String language, String author) {
        this.pages = pages;
        this.publishingHouse = publishingHouse;
        this.tom = tom;
        this.godIzdaniya = godIzdaniya;
        this.language = language;
        this.author = author;
        maxpages = Math.max(maxpages, pages);
    }

    public Book(String publishingHouse, int tom, int godIzdaniya, String language) {
        this.pages = 249;
        this.publishingHouse = publishingHouse;
        this.tom = tom;
        this.godIzdaniya = godIzdaniya;
        this.language = language;
        maxpages = Math.max(maxpages, pages);
    }
}


