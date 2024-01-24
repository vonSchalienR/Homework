package Ex2;

import java.util.Random;

public class KT2_8 {

    public static void main(String[] args) {
        Random random = new Random();

        int luku;
        int lukujenSumma = 0;
        int lukujenMaara = 0;
        int parillisetLuvut = 0;
        int parittomatLuvut = 0;

        do {
           
            luku = random.nextInt(100) + 1;

           
            lukujenSumma += luku;
            lukujenMaara++;

            if (luku % 2 == 0) {
                parillisetLuvut++;
            } else {
                parittomatLuvut++;
            }

        } while (luku < 1 || luku > 9);

        
        lukujenMaara--;

       
        System.out.println("Arvottujen lukujen määrä: " + lukujenMaara);
        System.out.println("Lukujen summa: " + lukujenSumma);
        System.out.println("Keskiarvo: " + (double) lukujenSumma / lukujenMaara);

        
        if (luku % 2 == 0) {
            System.out.println("Parillisten lukujen määrä: " + parillisetLuvut);
        } else {
            System.out.println("Parittomien lukujen määrä: " + parittomatLuvut);
        }
    }
}
  
    
