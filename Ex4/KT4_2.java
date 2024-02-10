package Ex4;

import java.util.Scanner;

public class KT4_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä ensimmäinen luku: ");
        double luku1 = scanner.nextDouble();

        System.out.print("Syötä toinen luku: ");
        double luku2 = scanner.nextDouble();

        // Yhteenlasku
        double summa = luku1 + luku2;
        System.out.println("Summa: " + summa);

        // Vähennyslasku
        double erotus = luku1 - luku2;
        System.out.println("Erotus: " + erotus);

        // Kertolasku
        double tulo = luku1 * luku2;
        System.out.println("Tulo: " + tulo);

        // Jakolasku
        if (luku2 != 0) {
            double osamaara = luku1 / luku2;
            System.out.println("Osamäärä: " + osamaara);
        } else {
            System.out.println("Jakolasku nollalla ei ole määritelty.");
        }

        scanner.close();
    }
}

    
