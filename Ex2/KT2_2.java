package Ex2;

import java.util.Scanner;

public class KT2_2 {
   
          private static final Scanner lukija = new Scanner(System.in);
       public static void main(String[]arg) {

        int summa = 0;
        int edellinenluku = 0;
        int luku;

        do { 
            System.out.println("Syötä lukuja:");
            luku = lukija.nextInt();

        if (luku == edellinenluku) {
            System.out.println("Syötit saman luvun uudestaan, ohjelma päättyy.");
            break;
            
        }   else {
            summa += luku;
            edellinenluku = luku;
        }
    } while (true);

    System.out.println("Syötettyjen lukujen summa on:"+ summa);


        }

    

      


        

        

       
    }
    
    

