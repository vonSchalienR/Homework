package Ex5;
import java.util.Scanner;

public class tuntiesimerkkitoisto {

    private static final Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean lopetus = false;

        do {
        System.out.println("Lopetetaanko? 1= true, 2= false");   
        int loppu = lukija.nextInt();

        while (loppu < 1 || loppu > 2 ) {
          System.out.println(" Piti syöttää luku 1 tai 2, Syötä luku uudestaan.");  
          loppu = lukija.nextInt();
        }
        if (loppu == 1) 
            lopetus = true;
         else
        lopetus = false; // turha

          
        } while (! lopetus);
    }   
    
}
