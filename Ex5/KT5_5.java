package Ex5;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class KT5_5 {

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

       
        if (onkoDuplikaatteja(taulukko)) {
            System.out.println("\nTaulukossa esiintyy sama arvo ainakin kahdesti.");
        } else {
            System.out.println("\nTaulukossa ei esiinny samaa arvoa ainakaan kahdesti.");
        }
    }

    private static boolean onkoDuplikaatteja(int[] taulukko) {
        Set<Integer> set = new HashSet<>();

        for (int luku : taulukko) {
            if (!set.add(luku)) {
                return true; 
            }
        }

        return false; 
    }
}

    

