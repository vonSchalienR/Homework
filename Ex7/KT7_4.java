package Ex7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KT7_4 {
    
    public static void main(String[] args) {
        String teksti = "Maailman terveysjärjestön (WHO) mukaan COVID-19-pandemia jatkuu edelleen ympäri maailmaa. Uusien tapausten määrä on kasvanut viime kuukausina useissa maissa, mikä herättää huolta terveydenhuollon järjestelmien kuormittumisesta. Monet maat ovat ottaneet käyttöön uusia rajoituksia ja suosituksia taudin leviämisen hidastamiseksi. Tämänhetkisten tilastojen mukaan koronavirustartuntojen määrä on noussut merkittävästi erityisesti tietyillä alueilla, kuten Aasiassa ja Euroopassa. Tämä on johtanut lisääntyneeseen paineeseen sairaaloissa ja terveydenhuollon henkilöstössä. Samalla rokotuskampanjat ovat jatkuneet eri puolilla maailmaa. Monissa maissa on onnistuttu rokottamaan merkittävä osa väestöstä, mutta edelleen on alueita, joilla rokotuskattavuus on alhainen. Tämä asettaa haasteita taudin leviämisen estämiselle ja pandemian hallinnalle. Asiantuntijat korostavat edelleen hygienian ja turvavälien tärkeyttä viruksen leviämisen ehkäisemisessä. He muistuttavat myös siitä, että pandemian voittaminen vaatii globaalia yhteistyötä ja solidaarisuutta.";

        // Poista välimerkit ja pilkut tekstistä
        teksti = teksti.replaceAll("[^a-zA-Z0-9\\s-]", "");

        // Erota teksti sanoiksi
        String[] sanat = teksti.split("\\s+");

        int yhdysviivallaOlevienSanojenLukumaara = 0;

        // Tulosta sanat, joissa on yhdysviiva, ja laske niiden lukumäärä
        for (String sana : sanat) {
            if (sana.contains("-")) {
                System.out.println(sana);
                yhdysviivallaOlevienSanojenLukumaara++;
            }
        }

        System.out.println("Yhdysviivalla olevien sanojen lukumäärä: " + yhdysviivallaOlevienSanojenLukumaara);
    }
}

