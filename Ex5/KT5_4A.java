package Ex5;

import java.util.Random;

public class KT5_4A {

   
    public static void main(String[] args) {
       
        int[] taulukko = new int[10];

       
        Random random = new Random();

        
        for (int i = 0; i < taulukko.length; i++) {
            taulukko[i] = random.nextInt(99) + 1;  
        }

       
        System.out.print("Taulukko: ");
        for (int luku : taulukko) {
            System.out.print(luku + " ");
        }

    
        int nollia = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == 0) {
                nollia++;
            }
        }

       
        System.out.println("\nNollien määrä: " + nollia);
    }
}

    

