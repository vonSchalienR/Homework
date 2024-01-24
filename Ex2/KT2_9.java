package Ex2;

public class KT2_9 {
    public static void main(String[]arg) {
    
        
                
                System.out.print("   ");
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%4d", i);
                }
                System.out.println("\n----------------------------------------");
        
                
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%2d |", i);
                    for (int j = 1; j <= 10; j++) {
                        System.out.printf("%4d", i * j);
                    }
                    System.out.println();
                }
            }
        }
        

