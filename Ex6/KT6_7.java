package Ex6;


import java.util.Arrays;

public class KT6_7 {

    public static void main(String[] args) {
        
        System.out.println(onAnagrammit("kissa", "Kassi"));  
        System.out.println(onAnagrammit("hello", "world"));  
    }

    
    public static boolean onAnagrammit(String jono1, String jono2) {
        
        if (jono1 == null || jono2 == null || jono1.length() != jono2.length()) {
            return false;
        }

        
        char[] merkit1 = jono1.toLowerCase().toCharArray();
        char[] merkit2 = jono2.toLowerCase().toCharArray();

        
        Arrays.sort(merkit1);
        Arrays.sort(merkit2);

    
        return Arrays.equals(merkit1, merkit2);
    }
}

    
