package Ex6;

import java.util.Scanner;

public class KT6_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä ensimmäinen merkkijono: ");
        String ensimmainenJono = scanner.nextLine();

        System.out.print("Syötä toinen merkkijono: ");
        String toinenJono = scanner.nextLine();

        String pidempiJono = haePidempiJono(ensimmainenJono, toinenJono);

        System.out.println("Pidempi merkkijono on:\n" + pidempiJono);
    }

    public static String haePidempiJono(String jono1, String jono2) {
        if (jono1.length() >= jono2.length()) {
            return jono1;
        } else {
            return jono2;
        }
    }
}
