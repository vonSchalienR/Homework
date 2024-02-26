package Ex5;

import java.util.Random;

public class KT5_6 {
    
    // vastaus word-tiedostossa

    public static void main(String[] args) {
        // Luo taulukko
        int[] taulukko = new int[10];

        // Luo satunnaislukugeneraattori
        Random random = new Random();

        // Täytä taulukko satunnaisilla nousevissa luvuilla
        for (int i = 0; i < taulukko.length; i++) {
            taulukko[i] = i * 2;  // Nouseva luku, esimerkiksi i * 2
        }

        // Tulosta taulukon sisältö
        System.out.print("Taulukko: ");
        for (int luku : taulukko) {
            System.out.print(luku + " ");
        }

        // Tarkista esiintyykö taulukossa sama arvo ainakin kahdesti
        if (onkoDuplikaatteja(taulukko)) {
            System.out.println("\nTaulukossa esiintyy sama arvo ainakin kahdesti.");
        } else {
            System.out.println("\nTaulukossa ei esiinny samaa arvoa ainakaan kahdesti.");
        }
    }

    // Metodi tarkistaa esiintyykö taulukossa sama arvo ainakin kahdesti
    private static boolean onkoDuplikaatteja(int[] taulukko) {
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] == taulukko[i - 1]) {
                return true;  // Löydettiin duplikaatti, voidaan lopettaa tarkastelu
            }
        }
        return false;  // Taulukossa ei ole duplikaatteja
    }
}


