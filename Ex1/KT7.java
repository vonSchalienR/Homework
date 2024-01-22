package Ex1;

import java.util.Scanner;

public class KT7 {
    private static final Scanner lukija = new Scanner (System.in);
    public static void main(String[]args){

        
        System.out.println("Syötä tenttipistemäärä");

        int pistemäärä = lukija.nextInt();


        if (pistemäärä >=0 && pistemäärä <=11 ){
            System.out.println("Hylätty");
        } else if (pistemäärä >=12 && pistemäärä <=16 ) {
            System.out.println("1");
            
        } else if (pistemäärä >=17 && pistemäärä <=21) {
            System.out.println("2");
        } else if (pistemäärä >=22 && pistemäärä <=24) {
            System.out.println("3");
        }
          
        }

    }
    

