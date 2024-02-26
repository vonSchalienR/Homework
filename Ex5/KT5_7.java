package Ex5;

import java.util.Arrays;
import java.util.Scanner;

public class KT5_7 {


    public static void main(String[] args) {
       
        int[] taulukko = luoNousevaTaulukko(10);

       
        System.out.print("Taulukko: ");
        for (int luku : taulukko) {
            System.out.print(luku + " ");
        }

      
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAnna etsittävä arvo: ");
        int etsittavaArvo = scanner.nextInt();

      
        boolean loytyy = etsiArvo(taulukko, etsittavaArvo);

       
        if (loytyy) {
            System.out.println("Arvo " + etsittavaArvo + " löytyy taulukosta.");
        } else {
            System.out.println("Arvo " + etsittavaArvo + " ei löydy taulukosta.");
        }
    }

  
    private static int[] luoNousevaTaulukko(int koko) {
        int[] taulukko = new int[koko];

        for (int i = 0; i < koko; i++) {
            taulukko[i] = i * 2;  
        }

        return taulukko;
    }

    
    private static boolean etsiArvo(int[] taulukko, int etsittavaArvo) {
        int indeksi = Arrays.binarySearch(taulukko, etsittavaArvo);

       
        return indeksi >= 0;
    }
}



