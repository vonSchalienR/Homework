package Ex7;
import java.util.Scanner;
public class KT7_6 {

   
    public static void main(String[] args) {
        String[] maat = {"Suomi", "Japani", "Yhdysvallat", "Ranska", "Kiina"};
        String[] pääkaupungit = {"Helsinki", "Tokio", "Washington D.C.", "Pariisi", "Peking"};

        Scanner lukija = new Scanner(System.in);

        System.out.println("Tervetuloa pääkaupunkipeliin!");

        boolean jatkaPelia = true;
        while (jatkaPelia) {
            int oikeinArvatut = 0;

            for (int i = 0; i < maat.length; i++) {
                System.out.println("Maa on " + maat[i] + ". Mikä on sen pääkaupunki?");
                String vastaus = lukija.nextLine();

                if (vastaus.equalsIgnoreCase(pääkaupungit[i])) {
                    System.out.println("Oikein!");
                    oikeinArvatut++;
                } else {
                    System.out.println("Väärin! Oikea vastaus oli: " + pääkaupungit[i]);
                }
            }

            System.out.println("Peli päättyi. Saavutit " + oikeinArvatut + " pistettä.");

            // Pyydä käyttäjää päättämään, haluaako hän jatkaa pelaamista
            System.out.print("Haluatko pelata uudestaan? (kyllä/ei): ");
            String jatka = lukija.nextLine();
            jatkaPelia = jatka.equalsIgnoreCase("kyllä");
        }

        System.out.println("Kiitos pelaamisesta!");
    }
}

    

