import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void printList(List<String> list, int count) {
        try {
            System.out.println(list.get(0));
            for (int i = 0; i < list.size(); i++) {
                System.out.println((count++) + "." + list.get(i + 1));
            }
        } catch (IndexOutOfBoundsException err) {
            return;
        }
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(0, "Список задач:");
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int summ = 0;
        try {
            while (true) {
                System.out.println("Выберите действие");
                System.out.println("1. Добавить задачу");
                System.out.println("2. Вывести список задач");
                System.out.println("3. Удалить задачу");
                System.out.println("0. Выход");
                String input = scanner.nextLine();
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        summ++;
                        System.out.println("Введите задачу для планирования:");
                        String entry = scanner.nextLine();
                        list.add(summ, entry);
                        break;
                    case 2:
                        System.out.println("\n");
                        printList(list, count);
                        break;
                    case 3:
                        System.out.println("Номер задачи для удаления");
                        Scanner scannerTaskInt = new Scanner(System.in);
                        int taskInt = scannerTaskInt.nextInt();
                        list.remove(taskInt);
                        break;
                    case 0:
                        return;
                    default:
                }
            }
        } catch (Exception in) {
            return;
        }

    }
}