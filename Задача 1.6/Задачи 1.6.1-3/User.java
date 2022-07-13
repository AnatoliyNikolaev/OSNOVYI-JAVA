public class User {
    public String mail;
    public String name;
    public String surname;

    public static int totalOnline;


    public User(String mail, String name, String surname) {
        this.mail = mail;
        this.name = name;
        this.surname = surname;
        totalOnline = totalOnline + 1;
    }
}

