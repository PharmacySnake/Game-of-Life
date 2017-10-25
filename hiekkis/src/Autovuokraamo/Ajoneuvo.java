package Autovuokraamo;

public class Ajoneuvo {

    public String rek;
    public String malli;
    public int vuosi;
    public int ajetutKilometrit;
    public int hinta;
    public Varaukset varaukset;

    public Ajoneuvo(String rek, String malli, int vuosi, int kilsat, int hinta, Varaukset varaukset) {
        this.rek = rek;
        this.malli = malli;
        this.vuosi = vuosi;
        this.ajetutKilometrit = kilsat;
        this.hinta = hinta;
        this.varaukset = varaukset;
    }

    public void setRekkari(String uusRek) {

    }

    public String getRekkari() {
        return null;
    }

    public void setMalli(String uusMalli) {

    }

    public String getMalli() {
        return null;
    }

    public void setVuosi(int uusVuosi) {

    }

    public int getVuosi() {
        return 0;
    }

    public void setKilometrit(int uusKm) {
        this.ajetutKilometrit = uusKm;
    }

    public int getKilometrit() {
        return 0;
    }

    public void setHinta(int uusHinta) {
        this.hinta = uusHinta;
    }

    public int getHinta() {
        return 0;
    }

    public Varaukset getVaraukset() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}
