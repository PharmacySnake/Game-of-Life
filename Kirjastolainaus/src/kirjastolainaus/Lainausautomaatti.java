package kirjastolainaus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lainausautomaatti {

    public static void main(String[] args) {
        Asiakas asiakas = new Asiakas(12345, "Ande", "Pande", "Papanapolku 2");
        List<Kirjat> lainattavatKirjat = new ArrayList();

        if (tarkistaLainaoikeus(asiakas)) {
            lainausAutomaatti(lainattavatKirjat, asiakas);
        }

    }

    public static boolean tarkistaLainaoikeus(Asiakas asiakas) {
        return true;
    }

    public static void lainausAutomaatti(List lainattavatKirjat, Asiakas asiakas) {
        Lainaus lainaus;
        Date date;
        for (int i = 0; i < lainattavatKirjat.size(); i++) {}
    }
}
