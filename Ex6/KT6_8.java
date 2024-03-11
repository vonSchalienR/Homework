package Ex6;

public class KT6_8 {

 

        public static void main(String[] args) {
            
            String alkuperainen = "tämä on esimerkki kapitalisointimetodista";
            String kapitalisoitu = kapitalisoi(alkuperainen);
            System.out.println(kapitalisoitu);
        }
    
        
        public static String kapitalisoi(String mjono) {
            
            if (mjono == null || mjono.isEmpty()) {
                return "";
            }
    
            
            String[] sanat = mjono.split(" ");
    
            
            for (int i = 0; i < sanat.length; i++) {
                if (!sanat[i].isEmpty()) {
                    sanat[i] = Character.toUpperCase(sanat[i].charAt(0)) + sanat[i].substring(1);
                }
            }
    
            
            return String.join(" ", sanat);
        }
    }
    
    

