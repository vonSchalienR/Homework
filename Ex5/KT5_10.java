package Ex5;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KT5_10 {
    

    public static void main(String[] args) {
        int[] kayttajanRivi = kysyLottorivi("Syötä lottorivi (7 numeroa välillä 1-40): ");
        int[] virallinenRivi = arvoLottorivi();

       
        System.out.println("Käyttäjän lottorivi: " + Arrays.toString(kayttajanRivi));
        System.out.println("Virallinen lottorivi: " + Arrays.toString(virallinenRivi));

        int oikeinMenneet = tarkistaOikeinMenneet(kayttajanRivi, virallinenRivi);

      
        System.out.println("Oikein menneet numerot: " + oikeinMenneet);
    }

    
    private static int[] kysyLottorivi(String ohje) {
        Scanner scanner = new Scanner(System.in);
        int[] lottorivi = new int[7];

        System.out.println(ohje);
        for (int i = 0; i < lottorivi.length; i++) {
            lottorivi[i] = scanner.nextInt();
        }

        Arrays.sort(lottorivi);

        return lottorivi;
    }

    private static int[] arvoLottorivi() {
        int[] lottorivi = new int[7];
        Random random = new Random();

        for (int i = 0; i < lottorivi.length; i++) {
            int arvottuNumero;

          
            do {
                arvottuNumero = random.nextInt(40) + 1;
            } while (sisaltaaNumero(lottorivi, arvottuNumero));

            lottorivi[i] = arvottuNumero;
        }

       
        Arrays.sort(lottorivi);

        return lottorivi;
    }

   
    private static boolean sisaltaaNumero(int[] taulukko, int numero) {
        for (int luku : taulukko) {
            if (luku == numero) {
                return true;
            }
        }
        return false;
    }

   
    private static int tarkistaOikeinMenneet(int[] kayttajanRivi, int[] virallinenRivi) {
        int oikeinMenneet = 0;

        for (int luku : kayttajanRivi) {
            if (Arrays.binarySearch(virallinenRivi, luku) >= 0) {
                oikeinMenneet++;
            }
        }

        return oikeinMenneet;
    }
}


