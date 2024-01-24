package Ex2;

public class KT2_10 {
    public static void main(String[]args){
       

            
                int n = 10;  
        
                System.out.println("Fibonacci-luku F(" + n + "): " + fibonacci(n));
            }
        
            public static int fibonacci(int n) {
                if (n <= 1) {
                    return n;
                } else {
                    return fibonacci(n - 1) + fibonacci(n - 2);
                }
            }
        }
        
    
