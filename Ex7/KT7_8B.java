package Ex7;

public class KT7_8B {
   
        public static void main(String[] args) {
            String[] nimet = {"Matti", "Anna", "Teppo", "Liisa", "Eeva", "Jussi", "Sari", "Pekka"};
    
            // Kuplalajittelu
            for (int i = 0; i < nimet.length - 1; i++) {
                for (int j = 0; j < nimet.length - 1 - i; j++) {
                    if (nimet[j].compareTo(nimet[j + 1]) > 0) {
                        // Vaihda paikkoja
                        String temp = nimet[j];
                        nimet[j] = nimet[j + 1];
                        nimet[j + 1] = temp;
                    }
                }
            }
    
            // Tulosta järjestetyt nimet
            System.out.println("Nimet aakkosjärjestyksessä:");
            for (String nimi : nimet) {
                System.out.println(nimi);
            }
        }
    }
    

