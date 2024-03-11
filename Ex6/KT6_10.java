package Ex6;

public class KT6_10 {
  

        public static void main(String[] args) {
            
            onSamojaIndekseissa("kissa", "kassi");
        }
    
        
        public static void onSamojaIndekseissa(String jono1, String jono2) {
            
            if (jono1 == null || jono2 == null || jono1.length() != jono2.length()) {
                System.out.println("Merkkijonot eivät ole samanpituiset.");
                return;
            }
    
            
            for (int i = 0; i < jono1.length(); i++) {
                if (jono1.charAt(i) == jono2.charAt(i)) {
                    System.out.println(jono1.charAt(i) + ":" + i);
                }
            }
    
            
            if (jono1.equals(jono2)) {
                System.out.println("Merkkijonot ovat identtiset.");
            } else {
                System.out.println("Ei ole samoja merkkejä samoissa indekseissä.");
            }
        }
    }
    
    

