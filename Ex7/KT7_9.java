package Ex7;

import java.util.Random;

public class KT7_9 {
   


    public static void main(String[] args) {
        String[] veljenpojat = {"Tupu", "Hupu", "Lupu"};
        String[] sisarentyttäret = {"Leenu", "Liinu", "Tiinu"};

        // Sekoita veljenpojat ja sisarentyttäret
        shuffleArray(veljenpojat);
        shuffleArray(sisarentyttäret);

        System.out.println("Peliparit:");

        // Tulosta muodostetut peliparit
        for (int i = 0; i < veljenpojat.length; i++) {
            System.out.println(veljenpojat[i] + " - " + sisarentyttäret[i]);
        }
    }

    // Metodi taulukon sekoittamiseen
    private static void shuffleArray(String[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Vaihda paikkoja
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}

    

