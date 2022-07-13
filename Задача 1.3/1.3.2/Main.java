import java.util.Scanner;

class Main {
   
    public static void main(String[] args) {
        int sum=0; //количество набранных очков
        int xx;
        Scanner scanner = new Scanner(System.in);
        while (true)  {
            System.out.println("Введите год в формате: yyyy количество-дней");
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            xx = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 366:365;
            if (xx != days) {
                break;
            }
            sum++;
      }
      System.out.println("Неправильно! + В этом году" + xx + "дней!");
      System.out.println("набрано очков:" + sum);
          }
}
