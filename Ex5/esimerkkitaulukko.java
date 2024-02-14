package Ex5;

import java.util.Scanner;

public class esimerkkitaulukko {

    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {

        int[] luvut = {4,7,12,10,15,8,-5,7};
        int[] taulu;

        System.out.println("Luvut taulukon indeksissä 2 olevan alkion arvo");
        System.out.println(luvut[2]);

        System.out.println("Koko taulukko:");
        for (int i = 0; i < luvut.length; i++){
        System.out.println(luvut[1]+" ");
        }
        System.out.println("\n");
    
        taulu = luvut;
        taulu [1] = luvut[0];
        System.out.println(taulu);

        String[] mjonot = new String[5];
        mjonot[0]= "kukka";
        mjonot[2]= "kakku";
        mjonot[4]= "kukkia";
        
        
    }
    
}
