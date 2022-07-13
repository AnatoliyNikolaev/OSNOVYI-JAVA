import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();

        fillContacts(phoneBook);
        fillMissedCalls(missedCalls);

        System.out.println(
                missedCalls.toString(phoneBook));
    }

    private static void fillMissedCalls(MissedCalls missedCalls) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите номер пропущенного или \"end\"для выхода");
                final String userInput = scanner.nextLine();
                if ("end".equals(userInput)) break;
                missedCalls.addMissedCall(userInput);
            }
        }
    }

    private static void fillContacts(PhoneBook phoneBook) {
        phoneBook.addContact(
                PhoneBook.createContact("Алексей", "123"));
        phoneBook.addContact(
                PhoneBook.createContact("Алина", "124"));
        phoneBook.addContact(
                PhoneBook.createContact("Анатолий", "125"));
        phoneBook.addContact(
                PhoneBook.createContact("Юрий", "321"));
        phoneBook.addContact(
                PhoneBook.createContact("Юлия", "322"));
    }
}