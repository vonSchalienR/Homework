package Ex5;
import java.util.Scanner;

public class tuntiesimerkkitoisto {

    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean lopetus = false; // joko jotain tapahtuu tai ei tapahdu- käytä boolean muuttujaa josvaihtoehtoja vain 2

        do {
        System.out.println("Lopetetaanko? true = kyllä false = ei");   
       //*  int loppu = lukija.nextInt();/** 
       lopetus = lukija.nextBoolean(); // lukija.nextint();

       /** 
        while (loppu < 1 || loppu > 2 ) {
          System.out.println(" Piti syöttää luku 1 tai 2, Syötä luku uudestaan.");  
          loppu = lukija.nextInt();
        }
        **/
        /** 
        if (loppu == 1) 
            lopetus = true;
         else
        lopetus = false; // turha
        **/
          
        } while (! lopetus);
    }   
    
}
