package Ex1;
import java.util.Scanner;
public class KT6 {
private static final Scanner lukija = new Scanner (System.in);
public static void main(String[]arg){

    
        System.out.println("Syötä luku 1, 2 tai 3:");

        int luku = lukija.nextInt();
        lukija.nextLine();

        if (luku == 1){
            System.out.println("Yksi");
        } else if (luku == 2) {
            System.out.println("Kaksi");
            
        } else if (luku == 3) {
            System.out.println("kolme");
        } else {
            System.out.println("Väärä luku");
        }
         







    }
      
    
   
    
    
}
