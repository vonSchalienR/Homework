package Ex2;

import java.util.Scanner;

public class KT2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Anna lukualueen alaraja: ");
        int alaraja = scanner.nextInt();

        System.out.print("Anna lukualueen yläraja: ");
        int ylaraja = scanner.nextInt();

        int kayttajanLuku;
        do {
            System.out.print("Anna luku lukualueen sisällä: ");
            kayttajanLuku = scanner.nextInt();

            if (kayttajanLuku < alaraja || kayttajanLuku > ylaraja) {
                System.out.println("Luku ei ole lukualueen sisällä. Anna uusi luku.");
            }

        } while (kayttajanLuku < alaraja || kayttajanLuku > ylaraja);

        if (kayttajanLuku - alaraja < ylaraja - kayttajanLuku) {
          
            int summa = 0;
            for (int i = 0; i < 3; i++) {
                System.out.print("Anna negatiivinen luku: ");
                int negatiivinenLuku = scanner.nextInt();
                summa += negatiivinenLuku;
            }
            System.out.println("Negatiivisten lukujen summa on: " + summa);
        } else {
            System.out.println("Luku ei ole lähempänä alarajaa kuin ylärajaa. Ei tehdä mitään.");
        }

        scanner.close();
    }
}

    
