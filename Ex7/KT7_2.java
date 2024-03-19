package Ex7;

import java.util.Scanner;

public class KT7_2 {
    

public class NimiMatriisi {
    public static void tulostaMatriisi(String nimi, int koko) {
        int nimenPituus = nimi.length();
        for (int rivi = 0; rivi < koko; rivi++) {
            for (int sarake = 0; sarake < koko; sarake++) {
                int indeksi = (rivi + sarake) % nimenPituus;
                System.out.print(nimi.charAt(indeksi) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä nimi ja kokonaisluku välilyönnillä [1..10]: ");
        String syote = lukija.nextLine();
        String[] osat = syote.split(" ");
        String nimi = osat[0];
        int koko = Integer.parseInt(osat[1]);

        if (koko < 1 || koko > 10) {
            System.out.println("Virheellinen kokonaisluku. Kokonaisluvun tulee olla väliltä [1..10].");
        } else {
            tulostaMatriisi(nimi, koko);
        }
    }
}

    
}
