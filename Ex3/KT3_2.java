package Ex3;
import java.util.Random;

public class KT3_2 {
    public static void main(String[]args) {

    int heitot =10;
    int kruunat=0;
    int klaavat=0;
    int pystyasento =0;
    int rabbithole=0;


    for (int i = 0; i<heitot; i++){
    int luku = new Random().nextInt(99)+1;

    if (luku>0 && luku<39){
        kruunat++;
        System.out.println("Heitto "+(i+1)+": kruuna");
    }else if (luku >40 && luku<79){
        klaavat++;
        System.out.println("Heitto "+(i+1)+": klaava");
    } else if (luku>80 && luku <84){
        pystyasento++;
        System.out.println("Heitto "+(i+1)+": pystyasento");
    } else {
        rabbithole++;
        System.out.println("Heitto "+(i+1)+": rabbithole");
    }
    } 

System.out.println("Tulokset:");
System.out.println("Kruunat "+kruunat);
System.out.println("Klaavat "+klaavat);
System.out.println("Pystyasennot "+pystyasento);
System.out.println("Rabbit hole "+rabbithole);
    }

    }
        
    

