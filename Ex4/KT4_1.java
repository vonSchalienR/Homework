package Ex4;

import java.util.Scanner;

public class KT4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku:");
        int luku1 = lueLuku(scanner);

        System.out.println("Syötä toinen luku:");
        int luku2 = lueLuku(scanner);

        int summa = luku1 + luku2;

        if (onkoParillinen(summa)) {
            System.out.println("Summa on parillinen.");
        } else {
            System.out.println("Summa ei ole parillinen.");
        }
        
        scanner.close();
    }

    public static int lueLuku(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Syötä kokonaisluku: "); // sout :)
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte. Syötä kokonaisluku.");
            }
        }
    }

    public static boolean onkoParillinen(int luku) {
        return luku % 2 == 0;
    }
}

