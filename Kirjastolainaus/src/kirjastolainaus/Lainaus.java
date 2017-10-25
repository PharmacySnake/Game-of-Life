package kirjastolainaus;

import java.util.Date;

public class Lainaus {

    private final Date lainattuPvm;
    private int lainanPituus;
    private boolean palautettu;
    private final Asiakas asiakas;
    private final Kirjat kirja;
    private final String isbn;

    public Lainaus(Date paivamaara, int lainanPituus, Asiakas asiakas, Kirjat kirja) {
        this.lainattuPvm = paivamaara;
        this.lainanPituus = lainanPituus;
        this.palautettu = false;
        this.asiakas = asiakas;
        this.kirja = kirja;
        this.isbn = this.kirja.getIsbn();
    }

    public void muutaTiedot(Date paivamaara, int lainanPituus, boolean palautettu) {
    }

    public void lainaa() {
        this.asiakas.lainaaKirja(this.isbn);
        this.palautettu = false;
    }

    public void palauta() {
        this.asiakas.palautaKirja(this.isbn);
        this.palautettu = true;
    }

    public Kirjat getKirja() {
        return null;
    }

    public Asiakas getAsiakas() {
        return null;
    }

    public Date getPaivamaara() {
        return null;
    }

    public int getPituus() {
        return 0;
    }

    public boolean getPalautettu() {
        return false;
    }
}
