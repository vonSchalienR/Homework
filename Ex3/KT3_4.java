package Ex3;

import java.util.Scanner;

public class KT3_4 {

    
private static final Scanner lukija = new Scanner(System.in);
public static void main(String [] args){
    
    int komento;

    do {
    System.out.println("1 = Luvuista suurin");
    System.out.println("2 = Lukujen tulo");
    System.out.println("3 = Ostosten summa");
    System.out.println("0 = Lopeta");

    System.out.println("Valitse vaihtoehdoista.");
    komento = lukija.nextInt();

        if (komento == 1) {
            suurin();
        } else if (komento == 2) {
            tulo();
        } else if (komento == 3) {
            summa();
        } else if (komento == 0) {
            System.out.println("Ohjelma lopetetaan.");
            break;
        } else {
            System.out.println("Virhe. Luku ei ole mikään vaihtoehdoista.");
        }
    } while (komento !=0);

}
private static void suurin(){
    System.out.println("Syötä luku: ");
    int luku = lukija.nextInt();
    System.out.println("Syötä toinen luku: ");
    int luku2 = lukija.nextInt();

    int suurinluku = Math.max(luku, luku2);
    System.out.println("Suurin luku: "+suurinluku);
}
private static void tulo(){
    System.out.println("Syötä luku: ");
    int luku = lukija.nextInt();
    System.out.println("Syötä toinen luku: ");
    int luku2 = lukija.nextInt();

    int lukujenTulo = luku*luku2;
    System.out.println("Lukujen tulo: "+lukujenTulo);
}
private static void summa(){
    System.out.println("Syötä luku: ");
    int luku = lukija.nextInt();
    System.out.println("Syötä toinen luku: ");
    int luku2 = lukija.nextInt();

    int lukujenSumma = luku + luku2;
    System.out.println("Lukujen summa: "+lukujenSumma);
}
}



