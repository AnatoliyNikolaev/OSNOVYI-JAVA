import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"№1 Хлеб", "№2 Яблоки", "№3 Молоко"};
        int[] prices = {100, 200, 300};
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + prices[i] + "руб/шт.");
        }
        int[] basket = new int[products.length];
        int[] sumCount = new int[products.length];
        int sumProducts = 0;
        while (true) {
            int productNumber = 0;
            int currentPrice = prices[productNumber];
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);

            basket[productNumber] += productCount;

            System.out.print("Ваша корзина:");
            System.out.println("товар№" + (productNumber + 1));
        }
        for (int i = 0; i < basket.length; i++) {
            sumCount[i] = basket[i] * prices[i];
            System.out.println("Стоимость=" + Arrays.toString(sumCount));
        }
        for (int c = 0; c < sumCount.length; c++) {
            sumProducts = sumProducts + sumCount[c];

        }

        System.out.println("Сумма чека = " + sumProducts + "руб.");
    }
}


