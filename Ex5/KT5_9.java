package Ex5;

import java.util.Arrays;
import java.util.Random; 

public class KT5_9 {
  
    
    public class LottoriviArpoja {
    
        public static void main(String[] args) {
            int[] lottorivi = arvoLottorivi();
            
           
            System.out.println("Arvottu lottorivi: " + Arrays.toString(lottorivi));
        }
    
       
        private static int[] arvoLottorivi() {
            int[] lottorivi = new int[7];
            Random random = new Random();
    
            for (int i = 0; i < lottorivi.length; i++) {
                int arvottuNumero;
    
              
                do {
                    arvottuNumero = random.nextInt(40) + 1;
                } while (sisaltaaNumero(lottorivi, arvottuNumero));
    
                lottorivi[i] = arvottuNumero;
            }
    
          
            Arrays.sort(lottorivi);
    
            return lottorivi;
        }
    
       
        private static boolean sisaltaaNumero(int[] taulukko, int numero) {
            for (int luku : taulukko) {
                if (luku == numero) {
                    return true;
                }
            }
            return false;
        }
    }
       
}
