package Ex1;

import java.util.Scanner;

public class KT4 {
    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[]arg){


        System.out.println("Syötä luku:");
        int luku1 = lukija.nextInt();
        lukija.nextLine();
        System.out.println("Syötä toinen luku:");
        int luku2 = lukija.nextInt();
        lukija.nextLine();
        System.out.println("Syötä kolmas luku:");
        int luku3 = lukija.nextInt();
        lukija.nextLine();

        int pienin = Math.min(Math.min(luku1, luku2), luku3);
        int suurin = Math.max(Math.max(luku1, luku2),luku3);
        int keskimmäinen = luku1 + luku2 + luku3 - pienin - suurin;

        System.out.println("Pienimmästä suurimpaan"+ pienin+ keskimmäinen+ suurin);
    }
    
}
