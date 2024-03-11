package Ex6;

public class KT6_4 {


        public static void main(String[] args) {
            
            ekatKirjaimet("Tämä on esimerkki merkkijonon ensimmäisten kirjainten tulostamisesta");
        }
    
       
        public static void ekatKirjaimet(String jono) {
           
            if (jono == null || jono.isEmpty()) {
                System.out.println("Merkkijono on tyhjä.");
                return;
            }
    
            String[] sanat = jono.split(" ");
    
            for (String sana : sanat) {
               
                if (!sana.isEmpty()) {
                  
                    System.out.print(sana.charAt(0) + " ");
                }
            }
    
            
            System.out.println();
        }
    }
    
    

