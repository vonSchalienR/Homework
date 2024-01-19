package Ex1;
import java.util.Scanner;
public class KT3 {
    private static final Scanner lukija = new Scanner (System.in);
public static void main(String[]args){



System.out.println("Syötä luku:");
int luku1 = lukija.nextInt();
lukija.nextLine();
System.out.println("Syötä toinen luku:");
int luku2 = lukija.nextInt();
lukija.nextLine();

System.out.println("Tulostetaanko suurempi vai pienempi?");
String vastaus = lukija.nextLine();

if ("suurempi".equals(vastaus)){
    if(luku1>luku2) {
        System.out.println("Suurempi luku"+ luku1);
    } else
    System.out.println("Suurempi luku"+luku2);

} else if ("pienempi".equals(vastaus)){
    if (luku1<luku2) {
        System.out.println("Pienempi luku"+ luku1);
        
    } else
    System.out.println("Pienempi luku"+ luku2);
} 



}
}

