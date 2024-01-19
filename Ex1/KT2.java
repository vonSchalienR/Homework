package Ex1;
import java.util.Scanner;
public class KT2 {
    private static final Scanner lukija = new Scanner (System.in);
public static void main(String[]args){


int luku1, luku2, suurin;

System.out.println("Syötä luku:");
luku1 = lukija.nextInt();
System.out.println("Syötä toinen luku:");
luku2 = lukija.nextInt();

if(luku1>luku2) {
suurin = luku1;
} else
suurin = luku2;

System.out.println("\nSuurempi = " +suurin);


}
}
