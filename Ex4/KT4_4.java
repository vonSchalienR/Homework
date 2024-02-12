package Ex4;

import java.util.Scanner;

public class KT4_4 {

    private static final Scanner lukija = new Scanner (System.in);
    public static void main(String[] args) {

        
                int[] luvut = lueLuvut(lukija);
        
                int suurin = etsiSuurin(luvut);
                int pienin = etsiPienin(luvut);
        
                tulostaSuurinJaPienin(suurin, pienin);
        
            }
        
            public static int[] lueLuvut(Scanner lukija) {
                System.out.println("Syötä neljä lukua:");
                int[] luvut = new int[4];
        
                for (int i = 0; i < luvut.length; i++) {
                    System.out.print("Syötä luku " + (i + 1) + ": ");
                    luvut[i] = lukija.nextInt();
                }
        
                return luvut;
            }
        
            public static int etsiSuurin(int[] luvut) {
                int suurin = luvut[0];
        
                for (int i = 1; i < luvut.length; i++) {
                    if (luvut[i] > suurin) {
                        suurin = luvut[i];
                    }
                }
        
                return suurin;
            }
        
            public static int etsiPienin(int[] luvut) {
                int pienin = luvut[0];
        
                for (int i = 1; i < luvut.length; i++) {
                    if (luvut[i] < pienin) {
                        pienin = luvut[i];
                    }
                }
        
                return pienin;
            }
        
            public static void tulostaSuurinJaPienin(int suurin, int pienin) {
                System.out.println("Suurin luku on: " + suurin);
                System.out.println("Pienin luku on: " + pienin);
            }
        }
        
        

