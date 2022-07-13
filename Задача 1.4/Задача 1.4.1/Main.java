import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax2 = (earnings) * 6 / 100;
        if (tax2 >= 0) {
            return tax2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Чтобы добавить сумму дохода, введите - 1");
            System.out.println("Чтобы добавить сумму расхода, введите - 2");
            System.out.println("Чтобы выбрать СНО, введите - 3");
            System.out.println("Для зхавершения работы, введите end");

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            System.out.println("Программа завершена");


            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Добавьте сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Добавьте сумму расхода:");
                    String moneyStr2 = scanner.nextLine();
                    int money2 = Integer.parseInt(moneyStr2);
                    earnings += money2;
                    break;
                case 3:
                    if (taxEarningsMinusSpendings(earnings, spendings) < taxEarnings(earnings)) {
                        System.out.println("Наиболее выгодная СНО это УСН доходы минус расходы");
                        System.out.println("Ваш налог составит" + taxEarningsMinusSpendings(earnings, spendings));
                        System.out.println("Налог на другой системе:" + taxEarnings(earnings));
                        System.out.println("Экономия составит " + (taxEarnings(earnings) - taxEarningsMinusSpendings(earnings, spendings)));
                    } else {
                        System.out.println("Наиболее выгодная СНО это УСН доходы");
                        System.out.println("Ваш налог составит" + taxEarnings(earnings));
                        System.out.println("Налог на другой системе:" + taxEarningsMinusSpendings(earnings, spendings));
                        System.out.println("Экономия составит " + taxEarningsMinusSpendings(earnings, spendings));
                    }

                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}

