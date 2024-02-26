package Ex5;

import java.util.Random;

public class KT5_3 {
    
    
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
    
           
            int nelioidenSumma = 0;
            for (int i = 0; i < taulukko.length; i++) {
                nelioidenSumma += taulukko[i] * taulukko[i];
            }
    
           
            System.out.println("\nNeliöiden summa: " + nelioidenSumma);
        }
    }
    
