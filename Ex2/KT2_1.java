package Ex2;

import java.util.Scanner;

public class KT2_1 {
    private static final Scanner lukija = new Scanner(System.in);
       public static void main(String[]arg) {

        int summa = 0;
        int luku;

        do { 
            System.out.println("Syötä lukuja:");
            luku = lukija.nextInt();

        if (luku != -1) {
            summa += luku;
            
        }    
    } while (luku !=-1);

    System.out.println("Syötettyjen lukujen summa on:"+ summa);


        }

    

      


        

        

       
    }
