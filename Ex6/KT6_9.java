package Ex6;

public class KT6_9 {

   

        public static void main(String[] args) {
            
            tulostaVokaalialkuiset("Aurinko on taivaalla, ja tuuli puhaltaa");
        }
    
        
        public static void tulostaVokaalialkuiset(String mjono) {
            
            if (mjono == null || mjono.isEmpty()) {
                System.out.println("Merkkijono on tyhjä.");
                return;
            }
    
            
            String[] sanat = mjono.split(" ");
    
            
            for (String sana : sanat) {
                
                if (!sana.isEmpty()) {
                    
                    char ensimmainenKirjain = Character.toLowerCase(sana.charAt(0));
                    if (ensimmainenKirjain == 'a' || ensimmainenKirjain == 'e' || ensimmainenKirjain == 'i' ||
                            ensimmainenKirjain == 'o' || ensimmainenKirjain == 'u' || ensimmainenKirjain == 'y') {
                        System.out.println(sana);
                    }
                }
            }
        }
    }
    
    

