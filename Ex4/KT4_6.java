package Ex4;

import java.util.Random;
import java.util.Scanner;

public class KT4_6 {


    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args){

        boolean jatketaan = true;
        while (jatketaan) {
            int valinta = pelaajanValinta(lukija);
            int tietokone = tietokoneenValinta();

            tulostaValinnat(valinta, tietokone);

            int tulos = tarkistaTulos(valinta, tietokone);
            if (tulos == 0) {
                System.out.println("Tasapeli! Valitaan uudet esineet.");
            } else if (tulos == 1) {
                System.out.println("Sinä voitit!");
            } else {
                System.out.println("Tietokone voitti!");
            }


            jatketaan = haluaakoJatkaaPelia(lukija);
        }
    }
    public static int pelaajanValinta(Scanner lukija) {
        System.out.println("Valitse (1) kivi, (2) paperi tai (3) sakset:");
        int valinta;
        do {
            System.out.print("Syötä valintasi: ");
            valinta = lukija.nextInt();
        } while (valinta < 1 || valinta > 3);
        return valinta;
    }

    public static int tietokoneenValinta() {
        Random arpoja = new Random();
        return arpoja.nextInt(3) + 1;
    }

    public static void tulostaValinnat(int pelaaja, int tietokone) {
        String[] vaihtoehdot = {"kivi", "paperi", "sakset"};
        System.out.println("Sinä valitsit: " + vaihtoehdot[pelaaja - 1]);
        System.out.println("Tietokone valitsi: " + vaihtoehdot[tietokone - 1]);
    }

    public static int tarkistaTulos(int pelaaja, int tietokone) {
        if (pelaaja == tietokone) {
            return 0;
        } else if ((pelaaja == 1 && tietokone == 3) ||
                (pelaaja == 2 && tietokone == 1) ||
                (pelaaja == 3 && tietokone == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
    public static boolean haluaakoJatkaaPelia(Scanner lukija) {
        System.out.print("Haluatko pelata uudestaan? (k/e): ");
        char vastaus = lukija.next().charAt(0);
        return vastaus == 'k' || vastaus == 'K';
    }
}


    
