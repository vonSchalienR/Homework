package Ex3;

import java.util.Scanner;
public class KT3_1 {
private static final Scanner lukija = new Scanner (System.in);
public static void main(String[]args){

int summa = 0;
int keskiarvo =0;
int määrä =0;
int parillinen=0;
int pariton=0;
int i = 1;


do{
System.out.println("Syötä luku:");
i = lukija.nextInt();
lukija.nextLine();

if (i!=-99){
    summa+=i;
    määrä++;
if (i%2==0){
    parillinen++;
} else {
    pariton++;
}
}

} while (i != -99);

if (määrä>0){
keskiarvo = summa / määrä;
}
if (i == -99);
System.out.println("Kiitti moi! Summa: "+summa+ " Määrä: "+määrä+" Keskiarvo: "+keskiarvo+" Parillinen: "+parillinen+" Pariton: "+pariton);

} 
}










    
    
    





