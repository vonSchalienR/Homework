package Ex6;

public class KT6_3 {
    
    public static void main(String[] args) {
        String alkuperainenJono = "Ankka ui";
        String kaannettyJono = takaperin(alkuperainenJono);
        System.out.println(kaannettyJono);
    }

    public static String takaperin(String jono) {
        char[] merkit = jono.toCharArray();
        int alku = 0;
        int loppu = merkit.length - 1;

        while (alku < loppu) {
            
            char temp = merkit[alku];
            merkit[alku] = merkit[loppu];
            merkit[loppu] = temp;

        
            alku++;
            loppu--;
        }

        return new String(merkit);
    }
}