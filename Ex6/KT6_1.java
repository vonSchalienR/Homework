package Ex6;

public class KT6_1 {
    

    public static void main(String[] args) {
        String esimerkkiJono = "Tämä on esimerkkijono";
        char etsittavaMerkki = 'o';

        int tulos = laskeKirjaimet(esimerkkiJono, etsittavaMerkki);
        System.out.println("Merkki '" + etsittavaMerkki + "' esiintyy " + tulos + " kertaa merkkijonossa.");
    }

    public static int laskeKirjaimet(String jono, char merkki) {
        int laskuri = 0;

        for (int i = 0; i < jono.length(); i++) {
            if (jono.charAt(i) == merkki) {
                laskuri++;
            } 
        }

        return laskuri;
    }
}
