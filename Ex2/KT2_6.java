package Ex2;

import java.util.Random;
import java.util.Scanner;

public class KT2_6 {
    public static void main(String[]arg) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

      
        int arvattuLuku = random.nextInt(100) + 1;

        System.out.println("Tervetuloa arvauspeliin! Arvaa luku väliltä 1-100.");

        int arvaus;
        int yritykset = 0;

        do {
            System.out.print("Syötä arvaus: ");
            arvaus = scanner.nextInt();
            yritykset++;

          
            if (arvaus == arvattuLuku) {
                System.out.println("Onneksi olkoon! Arvasit oikein luvulla " + arvattuLuku + ". Käytit " + yritykset + " yritystä.");
            } else if (arvaus < arvattuLuku) {
                System.out.println("Arvattu luku on suurempi. Yritä uudelleen.");
            } else {
                System.out.println("Arvattu luku on pienempi. Yritä uudelleen.");
            }

        } while (arvaus != arvattuLuku);

       
        scanner.close();
    }
}

    
        
    
    

