public class Main {

    public static void main(String[] args) {


        System.out.println("Самая большая книга =" + Book.maxpages + " страниц");
        Book book = new Book(1249, "Reh", 1, 1988, "Russian", "Лев Толстой");

        System.out.println("Самая большая книга =" + Book.maxpages + " страниц");


        Book book1 = new Book(249, "Pravda", 4, 2017, "English", "Даниэль Дефо");

        System.out.println("Самая большая книга =" + Book.maxpages + " страниц");
        Author author = new Author("Лев Толстой", 1828, "Руссский");
        System.out.println("Автор - " + author.name + " " + "Год рождения - " + " " + author.birthday + "года " + "Язык - " + " " + author.language);

        System.out.println("Пользователей онлайн =" + User.totalOnline);
        User user = new User("kirkorof@mail.ru", "Филипп", "Киркоров");
        System.out.println(user.mail + user.name + user.surname);
        System.out.println("Пользователей онлайн =" + User.totalOnline);
        User user1 = new User("gubin@mail.ru", "Андрей", "Губин");
        System.out.println(user1.mail + user1.name + user1.surname);
        System.out.println("Пользователей онлайн =" + User.totalOnline);
        User user2 = new User("pirogkof@mail.ru", "Артур", "Пирожков");
        System.out.println(user2.mail + user2.name + user2.surname);
        System.out.println("Пользователей онлайн =" + User.totalOnline);
    }
}



