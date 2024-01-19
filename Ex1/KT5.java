package Ex1;

import java.util.Scanner;

public class KT5 {
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
        System.out.println("Syötä neljäs luku");
        int luku4 = lukija.nextInt();
        lukija.nextLine();

        int pienin = Math.min(Math.min(Math.min(luku1, luku2), luku3), luku4);
        int suurin = Math.max(Math.max(Math.max(luku1, luku2), luku3), luku4);

        int vali1 = Math.min(Math.max(Math.min(luku1, luku2), Math.min(luku3, luku4)), Math.max(Math.min(luku1, luku3), Math.min(luku2, luku4)));
        int vali2 = luku1 + luku2 + luku3 + luku4 - vali1-pienin-suurin;

        System.out.println("Pienimmästä suurimpaan" + pienin +vali1 + vali2 + suurin);
    }
    
}