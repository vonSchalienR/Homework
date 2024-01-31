package Ex3;

import java.util.Random;
import java.util.Scanner;

public class KT3_3 {
    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[]args) {

         String[] varit = {"sininen", "punainen", "vihreä", "musta", "valkoinen"};

        int pisteidenSumma=0;
        int kierrokset=4;

        for (int kierros=1; kierros <= kierrokset; kierros++){
            int kone = new Random().nextInt(varit.length);
            String koneenVari = varit[kone];

            System.out.println("Kierros "+kierros+": ");

            int pisteet=0;
            boolean vastaus =false;

            for (int arvaus=1; arvaus <=3 && !vastaus; arvaus++){
                System.out.println("Arvaa väri: sininen, punainen, vihreä, musta tai valkoinen.");
                String arvattuVari = lukija.nextLine();

                if (arvattuVari.equalsIgnoreCase(koneenVari)){
                    vastaus = true;
                    pisteet=4-arvaus;
                    System.out.println("Oikea vastaus! Saat "+pisteet+ " pistettä.");
                    System.out.println("Kone valitsi värin: "+koneenVari);
                } else{
                    System.out.println("Väärin arvattu, yritä uudelleen.");
                }
            }
            pisteidenSumma +=pisteet;
        }

        System.out.println("Lopulliset pisteet: "+pisteidenSumma);
    }
}



