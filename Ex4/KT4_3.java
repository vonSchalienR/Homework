package Ex4;

import java.util.Scanner;

public class KT4_3 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int luku;
        int tulo = 1;

        do {
            luku = lueLuku(scanner);

            if (luku != -99) {
                tulo = laskeTulo(tulo, luku);
            }

        } while (luku != -99);

        tulosta(tulo);

        scanner.close();
    }

    // Metodi lueLuku lukee käyttäjältä kokonaisluvun ja palauttaa sen
    public static int lueLuku(Scanner scanner) {
        System.out.print("Syötä luku (-99 lopettaa): ");
        return scanner.nextInt();
    }

    // Metodi laskeTulo laskee kahden luvun tulon ja palauttaa sen
    public static int laskeTulo(int tulo, int luku) {
        return tulo * luku;
    }

    // Metodi tulosta tulostaa tuloksen näytölle
    public static void tulosta(int tulo) {
        System.out.println("Lukujen tulo on: " + tulo);

    }
    
}
