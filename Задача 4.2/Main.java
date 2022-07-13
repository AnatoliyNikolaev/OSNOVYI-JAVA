import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static Queue<Floors> floors = new PriorityQueue<>(new FloorsComporator());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        floors.offer(new Floors(0, 26));
        int summ = 1;
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int operation = scanner.nextInt();
            if (operation == 0) {
                System.out.println("Лифт проследовал по следующим этажам: ");
                while (!floors.isEmpty()) {
                    System.out.println(floors.poll());
                }
                break;
            }
            if (operation > 0 && operation <= 25) {
                summ++;
                floors.offer(new Floors(operation, summ));
            } else {
                System.out.println("Такого этажа нет в доме");
            }
        }
    }
}

