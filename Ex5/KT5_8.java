package Ex5;


import java.util.Arrays;
import java.util.Scanner;

public class KT5_8 {

    public static void main(String[] args) {
        int[] luvut = kysyLukuja();

       
        System.out.println("Syötit seuraavat luvut pienimmästä suurimpaan:");
        tulostaLuvut(luvut);
    }

    private static int[] kysyLukuja() {
        Scanner scanner = new Scanner(System.in);
        int[] luvut = new int[20];
        int luku;
        int indeksi = 0;

        do {
            System.out.print("Syötä luku (tai -1 lopettaaksesi): ");
            luku = scanner.nextInt();

            if (luku != -1) {
                luvut[indeksi++] = luku;
            }

        } while (luku != -1 && indeksi < 20);

      
        if (indeksi < 20) {
            luvut = Arrays.copyOf(luvut, indeksi);
        }

  
        Arrays.sort(luvut);

        return luvut;
    }

    private static void tulostaLuvut(int[] luvut) {
        for (int luku : luvut) {
            System.out.print(luku + " ");
        }
        System.out.println();
    }
}
