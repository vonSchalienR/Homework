package Ex6;

public class KT6_5 {


        public static void main(String[] args) {
          
            System.out.println(onPalindromi("asa"));  
            System.out.println(onPalindromi("omo"));  
            System.out.println(onPalindromi("saippuakauppias"));  
            System.out.println(onPalindromi("abc"));  
        }
    
      
        public static boolean onPalindromi(String jono) {
          
            String kaannetty = kaannaMerkkijono(jono);
    
          
            return jono.equals(kaannetty);
        }
    
       
        private static String kaannaMerkkijono(String jono) {
            StringBuilder kaannetty = new StringBuilder();
    
          
            for (int i = jono.length() - 1; i >= 0; i--) {
                kaannetty.append(jono.charAt(i));
            }
    
            return kaannetty.toString();
        }
    }
    
    

