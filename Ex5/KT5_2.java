package Ex5;

import java.util.Random;
public class KT5_2 {


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

       
        int suurin = taulukko[0];
        for (int i = 1; i < taulukko.length; i++) {
            if (taulukko[i] > suurin) {
                suurin = taulukko[i];
            }
        }

        
        System.out.println("\nSuurin arvo: " + suurin);
    }
}

    

