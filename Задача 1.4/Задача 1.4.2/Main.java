package Nik777;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Отбросить дробную часть");
        System.out.println("2. Сравнить");
        System.out.println("3. Округлить");

        String input = scanner.next();
        int operation = Integer.parseInt(input);
        switch (operation) {
            case 1:
                System.out.println("Введите дробное число");
                String otb = scanner.next();
                double b = Double.parseDouble(otb);
                long c = (long) b;

                System.out.println("Отброс дробной части = " +  Math.floor(b));
                break;
            case 2:
                System.out.println("Введите первое число");
                String v1 = scanner.next();
                double d1 = Double.parseDouble(v1);
                System.out.println("Введите второе число");
                String v2 = scanner.next();
                float d2 = Float.parseFloat(v2);

                if (Math.abs(d2 - d1) < 0.0001) {
                    System.out.println("Числа равны");
                } else {
                    System.out.println("Числа не равны" + (d2-d1));
                }
                break;
            case 3:
                System.out.println("Введите дробное число");
                String okr = scanner.next();
                float e1 = Float.parseFloat(okr);
                System.out.println("Округление = " + Math.round(e1));
                break;
            default:
        }
    }
}



