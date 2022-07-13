import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("Список оружии: " + "\n0.Пистолет\n1.Автомат\n2.Рпг\n3.Рогатка\n4.Водный пистолет\n");
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер чтобы выстрелить,"
                        + "-1 игра закончена\n ",
                player.getSlotsCount()
        );
        int slot = scanner.nextInt();
        if (slot == -1) System.out.println("Game over!");
        else player.shotWithWeapon(slot);
    }
}




