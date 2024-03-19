package Ex7;

public class KT7_7B {
    
 
        public static void main(String[] args) {
            int[] luvut = {4, 2, 7, 1, 9, 5, 8, 3};
    
            // Kuplalajittelu
            for (int i = 0; i < luvut.length - 1; i++) {
                for (int j = 0; j < luvut.length - 1 - i; j++) {
                    if (luvut[j] > luvut[j + 1]) {
                        // Vaihda paikkoja
                        int temp = luvut[j];
                        luvut[j] = luvut[j + 1];
                        luvut[j + 1] = temp;
                    }
                }
            }
    
            // Tulosta järjestetyt luvut
            System.out.println("Luvut suuruusjärjestyksessä:");
            for (int luku : luvut) {
                System.out.print(luku + " ");
            }
        }
    }
    
