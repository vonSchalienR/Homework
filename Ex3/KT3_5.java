package Ex3;

import java.util.Random;
import java.util.Scanner;

public class KT3_5 {
    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[]args){


    
   

        int voitto = 50;
        int pelaaja1 = 0;
        int pelaaja2= 0;
        int heitto;

        int kierros=1;


        do {
            int luku = new Random().nextInt(6)+1;
            System.out.println("Kierros "+kierros+": ");
            System.out.println("Pelaaja 1 (Enter-painike heittää noppaa). ");
            lukija.nextLine();
            heitto =luku;
            pelaaja1 += heitto;
            System.out.println("Heitto: " + heitto + " | Pisteet: " + pelaaja1);

            kierros++;



            int luku1 = new Random().nextInt(6)+1;
            System.out.print("Pelaaja 2 (Enter-painike heittää noppaa).");
            lukija.nextLine();
            heitto = luku1;
            pelaaja2 += heitto;
            System.out.println("Heitto: " + heitto + " | Pisteet: " + pelaaja2);
            lukija.nextLine();
            if (pelaaja1 >= voitto) {
                System.out.println("Pelaaja 1 voitti!");
                break;
            }else if  (pelaaja2 >= voitto) {
                System.out.println("Pelaaja 2 voitti!");
                break;
            }

        }while (pelaaja2!= 50);

        if (pelaaja1 == pelaaja2) {
            System.out.println("Pisteet ovat tasan, ei ole voittajaa!");

        }
        }



}




