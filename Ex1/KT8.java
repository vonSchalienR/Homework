package Ex1;

import java.util.Scanner;

public class KT8 {
     private static final Scanner lukija = new Scanner (System.in);

     public static void main(String[]arg){

        System.out.println("Syötä vuosiluku:");

        int vuosiluku = lukija.nextInt();
        lukija.nextLine();

        boolean karkaus = (vuosiluku % 4 == 0) || (vuosiluku % 400 == 0);

        if (karkaus) {
            System.out.println("Vuosi" + " "+ vuosiluku +" "+ "on karkausvuosi.");
            
        } else {
            System.out.println("Vuosi" + " " +vuosiluku +" "+ "ei ole karkausvuosi");
        }


     }
}
