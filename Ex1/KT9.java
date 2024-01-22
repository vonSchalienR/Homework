
package Ex1;

import java.util.Scanner;

public class KT9 {
     private static final Scanner lukija = new Scanner (System.in);

     public static void main(String[]arg){

        System.out.println("Syötä vuosi:");
        int vuosiluku = lukija.nextInt();
        lukija.nextLine();
        System.out.println("Syötä kuukausi:");
        String kuukausi = lukija.nextLine();
        

        boolean karkaus = (vuosiluku % 4 == 0) || (vuosiluku % 400 == 0);
        int päivä = 0;

     switch (kuukausi.toLowerCase()) {
         
        case "tammikuu":
        case "maaliskuu":
        case "toukokuu":
        case "heinäkuu":
        case "elokuu":
        case "lokakuu":
        case "joulukuu":

        päivä = 31;
        break;

        case "helmikuu":

            päivä = (karkaus) ? 29 : 28;

        break;

        case "huhtikuu":
        case "kesäkuu":
        case "syyskuu":
        case "marraskuu":
        
        päivä = 30;
        break;

        default:

        System.out.println("Virheellinen kuukausi");
        return;

     }
        System.out.println("Kuukaudessa" + kuukausi + " vuonna "+ vuosiluku + " on " + päivä +"päivää" );





            



        

        }


     }

