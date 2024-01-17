//Author: Rosa von Schalien (Hedelmä)


package Ex1;

import java.util.Random;
import java.util.Scanner;

public class valintarakenne {

    private static final Scanner lukija = new Scanner(System.in);

    public static void main(String[]args){

//pyydä käyttäjän syötä
System.out.println("Arvaa jokin luvuista 1,2 tai 3:");
int arvottuluku = new Random().nextInt();

//lukija.nextLine();
System.out.println("Käyttäjän syöte:"+arvottuluku);
System.out.println("Anna jokin luku:");
int toinenluku = lukija.nextInt();
System.out.println("toinen luku"+toinenluku);
lukija.nextLine(); // luetaan kokonaislukusyötön jälkeinen enter pois.



//arvo randomisti luku
int randomluku = new Random().nextInt(3)+1;
System.out.println("Arvottu luku"+randomluku);


//suorita vertailu
    if (arvottuluku == randomluku){
    System.out.println("***arvasit oikein***");
    } else if (arvottuluku >=1&& arvottuluku<=3){
        System.out.println("Hyvä yritys!");
    } else {
        System.err.println("Annoit jotain muuta kuin 1, 2 tai 3");
    }


    //liikennevaloesimerkki - merkkijono
    System.out.println("Punainen, keltainen vai vihreä");
    String liikennevalo = lukija.nextLine();
    if (liikennevalo.equals("punainen")) {
        System.out.println("pysähdy!!!");
    } else if (liikennevalo.equals("keltainen")) {
        System.out.println("odota");
    } else {
        System.out.println("mene");
    }
        
    // tulosta näytölle tulokset
    }
        
  }





    

