import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Исходная матрица");
        printFild(colors);
        int[][] userRotatedSize = new int[SIZE][SIZE];

        System.out.println("Введите угол поворота матрицы: 90, 180, 270 ");
        while (true) {
            choiceFild(colors, userRotatedSize);
        }
    }

    public static void printFild(int[][] userRotatedSize) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", userRotatedSize[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void choiceFild(int[][] fildSize, int[][] userRotatedSize) {

        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();

        System.out.println("Повернутая матрица:");

        switch (angle) {
            case 90:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        userRotatedSize[i][j] = fildSize[SIZE - j - 1][i];
                    }
                }
                printFild(userRotatedSize);
                break;
            case 180:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        userRotatedSize[i][j] = fildSize[SIZE - i - 1][SIZE - 1 - j];
                    }
                }
                printFild(userRotatedSize);
                break;
            case 270:
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        userRotatedSize[i][j] = fildSize[j][SIZE - i - 1];
                    }
                }
                printFild(userRotatedSize);
                break;
            default:

        }
    }
}





