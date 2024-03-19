package Ex7;

import java.util.Scanner;

public class KT7_1 {
    public static void tulostaMatriisi(String nimi, int numero) {
    

         int nimenPituus = nimi.length();
        for (int rivi = 0; rivi < numero; rivi++) {
            for (int sarake = 0; sarake < numero; sarake++) {
                int indeksi = (rivi + sarake) % nimenPituus;
                System.out.print(nimi.charAt(indeksi) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä nimi ja numero, erotettuna välilyönnillä: ");
        String syote = lukija.nextLine();
        String[] osat = syote.split(" ");
        String nimi = osat[0];
        int numero = Integer.parseInt(osat[1]);
        tulostaMatriisi(nimi, numero);
    }
}

    
