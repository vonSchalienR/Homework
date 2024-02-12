package Ex4;

import java.util.Scanner;

public class KT4_8 {
  

    private static int minuutit = 0;
    private static int sekunnit = 0;
    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Anna minuutit: ");
        minuutit = getMinuutit(lukija);
        System.out.print("Anna sekunnit: ");
        sekunnit = getSekunnit(lukija);

        tulosta();
    }
    public static int getMinuutit(Scanner lukija) {
        int min = lukija.nextInt();
        return (min < 0 || min > 5) ? 0 : min;
    }
    public static int getSekunnit(Scanner lukija) {
        int sek = lukija.nextInt();
        return (sek < 0) ? 0 : sek;
    }
    public static void tulosta() {
        if (sekunnit >= 60) {
            minuutit += sekunnit / 60;
            sekunnit %= 60;
        }

        if (minuutit > 5) {
            minuutit = 0;
            sekunnit = 0;
            System.out.println("Aika täyttyi. Asetettiin ajastin nollaan.");
        }

        System.out.printf("%02d:%02d\n", minuutit, sekunnit);
    }
}



