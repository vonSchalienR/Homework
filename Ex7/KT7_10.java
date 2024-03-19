package Ex7;
import java.util.Scanner;
public class KT7_10 {



    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int kerrojanAlaraja = kysyRaja("Kerrojan alaraja");
        int kerrojanYläraja = kysyRaja("Kerrojan yläraja");
        int kerrottavanAlaraja = kysyRaja("Kerrottavan alaraja");
        int kerrottavanYläraja = kysyRaja("Kerrottavan yläraja");

        // Tarkistetaan, että alarajat ovat pienempiä kuin ylärajat
        if (kerrojanAlaraja > kerrojanYläraja || kerrottavanAlaraja > kerrottavanYläraja) {
            System.out.println("Virheelliset rajat. Alarajan tulee olla pienempi kuin ylärajan.");
            return;
        }

        System.out.println("Kertolaskut:");

        for (int i = kerrojanAlaraja; i <= kerrojanYläraja; i++) {
            for (int j = kerrottavanAlaraja; j <= kerrottavanYläraja; j++) {
                int tulo = laskeTulo(i, j);
                System.out.println(i + " * " + j + " = " + tulo);
            }
        }
    }

    public static int kysyRaja(String teksti) {
        Scanner lukija = new Scanner(System.in);
        int raja = 0;
        boolean virhe = true;

        while (virhe) {
            System.out.print(teksti + ": ");
            try {
                raja = Integer.parseInt(lukija.nextLine());
                virhe = false;
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte. Anna kokonaisluku.");
            }
        }

        return raja;
    }

    public static int laskeTulo(int kerrojan, int kerrottava) {
        return kerrojan * kerrottava;
    }
}

